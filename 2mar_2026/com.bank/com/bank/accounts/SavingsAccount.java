package com.bank.accounts;

public class SavingsAccount extends accounts {

    private final double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        double interest;
        interest = balance * interestRate / 100;
        return interest;
    }
}