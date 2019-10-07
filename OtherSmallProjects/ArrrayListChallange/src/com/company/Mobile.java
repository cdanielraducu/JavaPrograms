package com.company;

import java.util.ArrayList;

public class Mobile {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public Mobile(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact){
        if(findContact(Contacts.getName()) <= 0){
            System.out.println("Contact is already on file");
        return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean removeContact(Contacts contact){
        int foundPos = findContact(contact);
        if(foundPos<0){
            System.out.println(contact.getName()+", was not found");
            return false;
        }
        this.myContacts.remove(foundPos);
        System.out.println(contact.getName() +, ", was deleted");
    }
    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for(int i = 0; i<this.myContacts.size(); i++){
            Contacts contact = new this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
    }
    public String queryContact(Contacts contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact list:");
        for(int i; i<this.myContacts.size();i++){
            System.out.println((i+1) + "."+
                    this.myContacts.get(i).getName() + "->"+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
