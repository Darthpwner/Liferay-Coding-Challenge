package com.company;
import com.company.Receipt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Receipt r = new Receipt();
        System.out.println(r.hasImportTax("imported hello"));
    }
}
