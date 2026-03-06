package com.bank.customers;

import com.bank.accounts.accounts;

public class Customer {

    private final int customerId;
    private final String name;
    private accounts account;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void linkAccount(accounts account) {
        this.account = account;
    }

    public void displayCustomerDetails() {

        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);

        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
        }
    }
}