package com.Dani;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance =0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0) {

            transactions.add(amount);
            this.balance +=amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        }else{
            System.out.println("cannot deposit negative sums");
        }
    }
    public void withdraw( int amount){
        int withdraw = -amount;
        if(withdraw < 0 ){
            this.transactions.add(withdraw);
            this.balance +=withdraw;
            System.out.println(amount + " widraw. Balance is now " + this.balance);
        }else{
            System.out.println("cannot withdraw negative sums");
        }
    }

    public void calculateBalannce(){
        this.balance=0;
        for(int i : this.transactions){
            this.balance +=i;
        }
        System.out.println("calculated balance is " + this.balance);
    }
}
