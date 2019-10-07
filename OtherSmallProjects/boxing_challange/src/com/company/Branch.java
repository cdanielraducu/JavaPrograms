package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    ArrayList<Customer> myCustomers;

    public ArrayList<Customer> getMyCustomers() {
        return myCustomers;
    }

    public Branch(String name){
        this.name = name;
        this.myCustomers = new ArrayList<Customer>();
    }
    public boolean addCustomer(Customer customer){
        if(findCustomer(customer.getName()) <= 0 ){
            System.out.println("Contact is already added");
            return false;
        }
        myCustomers.add(customer);
        return true;
    }
    public boolean addCustomerTransaction(String name, double amount){
        int pos  = findCustomer(name);
        if(pos <= 0){
            System.out.println("Customer "+ name + " doesn't exist");
            return false;
        }
        this.myCustomers.get(pos).addTransactions(amount);
        return true;
    }
    private int findCustomer(Customer customer ){
        return this.myCustomers.indexOf(customer);
    }
    private int findCustomer(String name){
        for(int i = 0 ; i <this.myCustomers.size() ; i++){
            Customer customer = this.myCustomers.get(i);
            if(customer.getName().equals(name)){
                return i;
            }
        }
        return 0;
    }
    public boolean removeCustomer(Customer customer){
        int pos = findCustomer(customer);
        if(pos<0){
            System.out.println(customer.getName() + " was not found");
            return false;
        }

        myCustomers.remove(pos);
        return true;
    }

    public String getName() {
        return name;
    }
}
