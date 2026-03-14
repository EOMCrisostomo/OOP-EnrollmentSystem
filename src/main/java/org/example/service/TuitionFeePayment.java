package org.example.service;

public class TuitionFeePayment {
    private final double PRICE_PER_UNIT = 1000;
    private double balance;
    private double totalTuition;

    public double calculateTuitionfees(int units, double discountRate){
        totalTuition = PRICE_PER_UNIT * units;
        if (discountRate != 0) {
            totalTuition = totalTuition - (totalTuition * discountRate);
        }
        return totalTuition;
    }

    public void makePayment(double amount){
        balance = totalTuition - amount;
    }

    public double getRemainingBalance(){
        return balance;
    }

    public boolean isFullyPaid(){
        return balance == 0;
    }
}
