package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList;
    private int myNumber;

    public MobilePhone(int myNumber){
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Is already on the file");
            return false;
        }
        contactList.add(contact);
        return true;
    }
    private int findContact(Contact contact){
        return this.contactList.indexOf(contact);
    }
    private int findContact(String name){
        for(int i = 0; i<this.contactList.size(); i++){
            Contact contact = this.contactList.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private boolean update(Contact oldContact, Contact newContact){
        int pos = findContact(oldContact);
        if(pos < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.contactList.set(pos,newContact);
        System.out.println("Contact updated");
        return true;
        //remove is the same as the update
    }
}
