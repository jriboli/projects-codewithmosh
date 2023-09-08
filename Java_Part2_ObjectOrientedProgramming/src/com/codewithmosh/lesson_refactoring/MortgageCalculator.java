package com.codewithmosh.lesson_refactoring;

public class MortgageCalculator {
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;
    private int principal;
    private float annualRate;
    private byte loanPeriod;

    public MortgageCalculator(int principal, float annualRate, byte loanPeriod){
        this.principal = principal;
        this.annualRate = annualRate;
        this.loanPeriod = loanPeriod;
    }

    public double calculateBalance(short numberOfPaymentsMade){
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage(){
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public byte getLoanPeriod(){
        return loanPeriod;
    }

    private int getNumberOfPayments() {
        return loanPeriod * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualRate / PERCENT / MONTHS_IN_YEAR;
    }
}
