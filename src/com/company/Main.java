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
    }

    void getOutput(String input) {
        Receipt r = new Receipt();

        String text[] = r.parseText(input);
        for(int i = 0; i < text.length; i++) {
            //System.out.println(text[i]);

            String line[] = r.parseLine(text[i]);


        }

        //r.addLineToReceipt(input);
    }

}
