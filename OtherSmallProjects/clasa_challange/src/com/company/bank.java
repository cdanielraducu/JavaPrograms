package com.company;
public class bank {
    private int number;
    private double balance;
    private String customer_name;

    public bank(int number) {
        this.number = number;
    }

    public bank(int number, double balance, String customer_name){
        this.number =  number;
        this.balance = balance;
        this.customer_name = customer_name;
    }
    public bank(){
        this(0,0,"No_one");
        System.out.println("Empty constructor");
    }


    public void setNumber(int number){
        this.number = number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public int getNumber(){
        return number;
    }
    public double getBlanace(){
        return balance;
    }
    public String getCustomer_name(){
        return customer_name;
    }
    public void deposit(){
        this.balance++;
    }

    public void withdrawal(int number){
        if(number==this.number){
        if(this.balance>0) balance--;
        else System.out.println("Insufficient funds");
        }else System.out.println("...calling the police!!!");
    }

}
