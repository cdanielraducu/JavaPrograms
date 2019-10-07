package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	bank account = new bank();
	account.setNumber(1999);
	account.setBalance(2);
	account.setCustomer_name("Dani");
	Scanner input = new Scanner(System.in);
	System.out.println("Enter pin code");
	int number = input.nextInt();
	account.withdrawal(number);
    System.out.println(account.getCustomer_name() + " have in his account " + account.getBlanace());

    bank account2 = new bank(1995,10,"Alex");
	bank account3 = new bank(1234);

    }
}
