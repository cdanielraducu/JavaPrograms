package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
        private String name;
        ArrayList<Branch> branches;

        public Bank(String name){
                this.name = name;
                this.branches = new ArrayList<Branch>();
        }
         public int findBranch(Branch branch){
                return this.branches.indexOf(branch);
         }
         public int findBranch(String branchName){
                for(int i = 0; i< this.branches.size(); i++){
                        Branch existingBranch = this.branches.get(i);
                        if(existingBranch.getName().equals(branchName)){
                                return i;
                        }
                }
                return 0;
         }
         public boolean addBranch(Branch branch){
                if(findBranch(branch) <= 0){
                        System.out.println("Branch was not found");
                        return false;
                }
                branches.add(branch);
                return true;
         }
         public boolean addBranch(String branchName) {
                 if (findBranch(name) <= 0) {
                         System.out.println("was not found");
                         return false;
                 }
                 this.branches.add(new Branch(name));
                 return true;
         }
         public boolean addCustomer(String branchName, String customerName, double initialAmount){
                Branch branch = this.branches.get(findBranch(branchName));
                if(branch  != null){
                        return branch.addCustomer(new Customer(customerName,initialAmount));

                }
                return false;
         }
         public boolean addCustomerTransaction(String branchName, String customerName, double amount){
                Branch branch = this.branches.get(findBranch(branchName));
                if(branch != null){
                        return branch.addCustomerTransaction(customerName,amount);
                }
                return false;
         }
         public boolean listCustomers(String branchName, boolean showTransactions){
                Branch branch = this.branches.get(findBranch(branchName));
                if(branch != null){
                        System.out.println("Customers details for branch" +
                                branch.getName());
                        ArrayList<Customer> branchCustomers = branch.getMyCustomers();
                        for(int i = 0;i< branchCustomers.size();i++){
                                Customer branchCustomer = branchCustomers.get(i);
                                System.out.println("Customer: " + branchCustomer.getName() +
                                        "[" + i + "]");
                                if(showTransactions){
                                        System.out.println("Transactions:");
                                        ArrayList<Double> transactions = branchCustomer.getTransactions();
                                        for(int j = 0; j< transactions.size();j++){
                                                System.out.println("["+i+"] Amount " + transactions.get(j));
                                        }
                                }
                        }
                        return true;
                }else{
                    return false;
                }
         }
}
