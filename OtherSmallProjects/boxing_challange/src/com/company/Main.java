package com.company;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("National");
	bank.addBranch("Adelaide");
	bank.addCustomer("Adelaide","tim",50);
	bank.addBranch("Sydney");
	bank.addCustomer("Sydney","Mike",175);

	bank.listCustomers("Adelaide",true);
    }
}
