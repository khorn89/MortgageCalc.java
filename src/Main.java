// Your First Program

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal Amount? ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate? ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("How many years? ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;


        System.out.println("Principal: " + principal);
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate);
        System.out.println("Number of Payments: " + numberOfPayments);


        // M = P [ I(1 + I)^N ] / [ (1 + I)^N – 1]
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));


        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        String result  = mortgageFormatted.format(mortgage);
        System.out.println("Your mortgage will be: " + result);
    }
}