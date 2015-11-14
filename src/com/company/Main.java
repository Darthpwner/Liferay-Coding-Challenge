package com.company;
import com.company.Receipt;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        //Input must be hardcoded and separated by the newline char (\n)

        //Test cases
        m.getOutput("1 book at 12.49\n1 music CD at 14.99\n1 chocolate bar at 0.85");
        m.getOutput("1 imported book at 12.49\n1 music CD at 14.99\n1 chocolate bar at 0.85");
        m.getOutput("1 imported box of chocolates at 10.00\n1 imported bottle of perfume at 47.50");
        m.getOutput("2 imported bottle of whiskey at 49.99\n3 Xbox 360 at 199.99\n1 packet of headache pills at 9.75\n1 iPhone 6S at 999.99");
        m.getOutput("5 imported bottle of water at 9.99\n1 tennis racket at 149.99\n1 Physics textbook at 199.99");
    }

    String padZeros(String amount) {
        String x = "" + amount.charAt(amount.length() - 2);

        if(x.equals(".")) {
            return amount + "0";
        }

        return amount;
    }

    void getOutput(String input) {
        Receipt r = new Receipt();

        r.addText(input);

        String print[] = new String[r.getTextLength()];
        for(int i = 0; i < r.getTextLength(); i++) {
            print[i] = r.getText(i).replaceAll("\\bat\\b", ":"); //Regex to find only exact match for "at"
            String originalCost[] = r.parseLine(print[i]);

            r.addCost(r.getPrice(print[i]));
            r.addTax(r.getTax(r.getText(i), r.getPrice(print[i])));

            double totalIndividualPrice = r.getPrice(print[i]) + r.getTax(r.getText(i), r.getPrice(print[i]));
            totalIndividualPrice = Math.round(totalIndividualPrice * 100.0)/100.0;
            String totalIndividualPriceString = String.valueOf(totalIndividualPrice);
            totalIndividualPriceString = padZeros(totalIndividualPriceString);
            print[i] = r.getText(i).replaceAll(originalCost[originalCost.length-1], totalIndividualPriceString);

            System.out.println(print[i]);
        }

        String taxString = String.valueOf(r.getTotalTax());
        taxString = padZeros(taxString);
        System.out.println("Sales Taxes : " + taxString);
        double total = r.getTotalCost() + r.getTotalTax();
        total = Math.round(total * 100.0)/ 100.0;   //Rounds to two decimal places
        String totalString = String.valueOf(total);
        totalString = padZeros(totalString);
        System.out.println("Total : " + totalString);

        System.out.println("");
    }

}
