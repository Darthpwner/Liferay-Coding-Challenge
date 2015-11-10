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
//    Receipt() {}

    void addLineToReceipt(String line) {
        m_receipt.add(line);    //Adds line to the next index of the vector
    }

    void printReceipt() {
        for(int i = 0; i < m_receipt.size(); i++) {
            System.out.println();
        }
    }

    String[] parseText(String text) {

    }

    Boolean hasSalesTax(String text) {

        return false;
    }

    //Parses for the string "imported" tax
    Boolean hasImportTax(String text) {
        String[] arr = text.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            if(arr[i].equals("imported")) {
                return true;
            }
        }

        return false;
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

    //Private
    private Vector<String> m_receipt;
}
