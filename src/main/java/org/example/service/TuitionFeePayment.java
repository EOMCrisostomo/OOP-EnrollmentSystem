package org.example.service;

public class TuitionFeePayment {
    private double pricePerUnit = 1000;
    private double balance;
    private double totalTuition;

    public double calculateTuitionfees(int units, double discountRate){
        double total = pricePerUnit * units;
        double discount = total * discountRate;
        totalTuition = total - discount;
        return totalTuition;
    }

    public void makePayment(double amount){
        this.totalTuition = amount;
        balance = amount - balance;
    }

    public void getRemainingBalance(){
        System.out.println("Remaining balance is: " + balance);
    }

    public boolean isFullyPaid(){
        return true;
    }
}
