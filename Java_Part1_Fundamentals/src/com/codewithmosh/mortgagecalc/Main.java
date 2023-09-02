package com.codewithmosh.mortgagecalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // avoid magic numbers in code - use constants
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mortage Calculator - fill in the following:");
        System.out.print("Principal: ");
        double prinical = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int numberOfYears = scanner.nextInt();
        int numberOfPayments = numberOfYears * MONTHS_IN_YEAR;

        double topOfFormula = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments);
        double bottomOfFormula = Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1;
        String totalFormatted = NumberFormat.getCurrencyInstance().format(prinical * (topOfFormula / bottomOfFormula));

        System.out.println("Mortgage: " + totalFormatted);
    }
}
