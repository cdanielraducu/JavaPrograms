package com.Dani;

import java.util.AbstractCollection;

public class Main {

    public static void main(String[] args) {
        Account timsAcount = new Account("Dani");
        timsAcount.deposit(9999);
        timsAcount.withdraw(9999);
        timsAcount.withdraw(1);
        timsAcount.deposit(-20);
        timsAcount.calculateBalannce();


        System.out.println("balance on account is " + timsAcount.getBalance());

        timsAcount.calculateBalannce();
    }
}
