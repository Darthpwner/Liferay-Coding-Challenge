package com.company;

import java.util.*;
import com.company.Book;
import com.company.Food;
import com.company.MedicalProduct;

/**
 * Created by Darthpwner on 11/9/15.
 */

//Sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products
    //Import duy is applicable on all imported goods at a rate of 5%
    //n% -> (np/100 rounded up to nearest 0.05)
public class Receipt {
    //Public
    Receipt() {
        m_cost = new Vector<>();
        m_tax = new Vector<>();
    }

    //Setters
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

    //Parses each line in the receipt
    String[] parseText(String text) {
        String[] arr = text.split("\n");

        return arr;
    }

    //Parses each word in a line
    String[] parseLine(String text) {
        String[] arr = text.split(" ");

        return arr;
    }

    //Searches for a keyword
    Boolean searchForKeyword(String[] arr, String keyword) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(keyword)) {
                return true;
            }
        }

        return false;
    }

    //Checks if the item does NOT have sales tax
    Boolean doesNotHaveSalesTax(String text) {
        String[] arr = parseLine(text);

        Book b = new Book();
        Food f = new Food();
        MedicalProduct mp = new MedicalProduct();

        for(int i = 0; i < b.getBookVectorSize(); i++) {
            if(searchForKeyword(arr, b.getBook(i))) {
                return true;
            }
        }

        for(int i = 0; i < f.getFoodVectorSize(); i++) {
            if(searchForKeyword(arr, f.getFood(i))) {
                return true;
            }
        }

        for(int i = 0; i < mp.getMedicalProductVectorSize(); i++) {
            if(searchForKeyword(arr, mp.getMedicalProduct(i))) {
                return true;
            }
        }

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

        double numItems = Double.parseDouble(arr[0]);
        double price = Double.parseDouble(arr[arr.length-1]);

        return numItems * price;
    }

    //Gets total tax information based on the primitive natural language processing (hardcoding keywords)
    double getTax(String line, double price) {
        double baseTax = 0, salesTax = 0, importTax = 0;

        //If good is a book, food, or medical product
        if(!doesNotHaveSalesTax(line)) {
            salesTax = price * 0.10;
        }

        //If the good is imported
        if(hasImportTax(line)) {
            importTax = price * 0.05;
        }

        baseTax = salesTax + importTax;
        return Math.round(baseTax * 10.0)/10.0;   //Gets two decimal places
    }

    //Gets total tax
    double getTotalTax() {
        double totalTax = 0;
        for(double tax: m_tax) {
            totalTax += tax;
        }

        return Math.round(totalTax * 100.0)/100.0;  //Gets two decimal places
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
    private Vector<Double> m_tax;
    private Vector<Double> m_cost;
    private String[] m_arr;
}
