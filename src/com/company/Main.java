package com.company;
import com.company.Receipt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Receipt r = new Receipt();
//        System.out.println(r.hasImportTax("imported hello"));
//        System.out.println(r.getPrice("Fuck boy 19.81" +
//                "Hello there"));
        Main m = new Main();

        m.getOutput("1 book at 12.49\n1 music CD at 14.99\n1 chocolate bar at 0.85");
        m.getOutput("1 imported book at 12.49\n1 music CD at 14.99\n1 chocolate bar at 0.85");
        m.getOutput("1 imported box of chocolates at 10.00\n1 imported bottle of perfume at 47.50");
        m.getOutput("1 imported bottle of perfume at 27.99\n1 bottle of perfume at 18.99\n1 packet of headache pills at 9.75\n1 imported box of chocolates at 11.25");
    }

    void getOutput(String input) {
        Receipt r = new Receipt();

        //String text[] = r.parseText(input); //Has all the lines
        r.addText(input);

        String print[] = new String[r.getTextLength()];
        for(int i = 0; i < r.getTextLength(); i++) {
            print[i] = r.getText(i).replaceAll("\\bat\\b", ":"); //Regex to find only exact match for "at"
            r.addCost(r.getPrice(print[i]));
            r.addTax(r.getTax(r.getText(i), r.getPrice(print[i])));

            System.out.println(print[i]);
        }

        System.out.println("Sales Taxes : " + r.getTotalTax());
        double total = r.getTotalCost() + r.getTotalTax();
        System.out.println("Total : " + total);

        System.out.println("");
    }

}
