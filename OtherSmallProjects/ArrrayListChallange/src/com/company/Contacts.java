package com.company;

public class Contacts extends Mobile {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static createContact(String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }
}
