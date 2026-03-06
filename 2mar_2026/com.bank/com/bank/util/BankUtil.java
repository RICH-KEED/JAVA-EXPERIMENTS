package com.bank.util;

public class BankUtil {

    private static int counter = 1000;

    public static String generateAccountNumber() {
        counter++;
        return "ACC" + counter;
    }

    public static void validateMinimumBalance(double balance) throws Exception {
        if (balance < 1000) {
            throw new Exception("Minimum balance should be ₹1000");
        }
    }
}