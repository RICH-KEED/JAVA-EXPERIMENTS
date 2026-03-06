package com.bank.accounts;

import com.bank.exceptions.InsufficientBalanceException;

public class accounts {

    protected String accountNumber;
    protected double balance;

    public accounts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds balance");
        }

        if (balance - amount < 1000) {
            System.out.println("Cannot withdraw. Minimum balance ₹1000 must be maintained.");
            return;
        }

        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}