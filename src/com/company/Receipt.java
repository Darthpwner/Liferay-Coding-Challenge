package com.company;

import java.util.*;

/**
 * Created by Darthpwner on 11/9/15.
 */

//Sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products
    //Import duy is applicable on all imported goods at a rate of 5%
    //n% -> (np/100 rounded up to nearest 0.05)
public class Receipt {
    //Public
    Receipt() {
        m_receipt = new Vector<>();
        m_cost = new Vector<>();
        m_tax = new Vector<>();
    }

    //Setters
    void addLineToReceipt(String line) {
        m_receipt.add(line);    //Adds line to the next index of the vector
    }

    void addTax(double tax) {
        m_tax.add(tax);    //Adds tax to the next index of the vector
    }

    void addCost(double cost) {
        m_cost.add(cost);    //Adds cost to next index of the vector
    }

    void addText(String input) {
        m_arr = parseText(input);
    }

    //Getters
    String getText(int i) {
        return m_arr[i];
    }

    int getTextLength() {
        return m_arr.length;
    }

    void printReceipt() {
        for(int i = 0; i < m_receipt.size(); i++) {
            System.out.println();
        }
    }

    String[] parseText(String text) {
        String[] arr = text.split("\n");

        return arr;
    }

    String[] parseLine(String text) {
        String[] arr = text.split(" ");

        return arr;
    }

    Boolean searchForKeyword(String[] arr, String keyword) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(keyword)) {
                return true;
            }
        }

        return false;
    }

    Boolean hasSalesTax(String text) {
        return false;
    }

    //Parses for the string "imported" tax
    Boolean hasImportTax(String text) {
        String[] arr = parseLine(text);

        if(searchForKeyword(arr, "imported")) {
            return true;
        }

        return false;
    }

    //Gets price from each line
    double getPrice(String text) {
        String[] arr = parseLine(text);

        double price = Double.parseDouble(arr[arr.length-1]);

        return price;
    }

    double getTax(String line, double price) {
        double baseTax = 0, salesTax = 0, importTax = 0;
        //If good is a book, food, or medical product
        if(hasSalesTax(line)) {
            salesTax = price * 0.10;
        }

        //If the good is imported
        if(hasImportTax(line)) {
            importTax = price * 0.05;
        }

        baseTax = salesTax + importTax;
        return baseTax;
    }

    //Gets total tax
    double getTotalTax() {
        double totalTax = 0;
        for(double tax: m_tax) {
            totalTax += tax;
        }

        return totalTax;
    }

    //Gets total cost
    double getTotalCost() {
        double total = 0;
        for (double price : m_cost) {
            total += price;
        }

        return Math.round(total * 100.0)/ 100.0; //Gets two decimal places
    }

    //Private
    private Vector<String> m_receipt;
    private Vector<Double> m_tax;
    private Vector<Double> m_cost;
    private String[] m_arr;
}
