package com.Dani;
import java.util.ArrayList;
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }


    public boolean Add(Contacts contact){
        if(findItem(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    //updating the contact
    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPos = findItem(oldContact);
        if(foundPos<0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPos,newContact);
        System.out.println(oldContact.getName()+ ", was replaced with " + newContact.getName());
        return true;
    }
    // method for finding where an item is
    private int findItem(Contacts contact){
        return myContacts.indexOf(contact);
    }
    private int findItem(String contactName){
        for(int i =0;i<this.myContacts.size();i++){
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    //method for adding an item
    public void modifyList(Contacts currentItem, Contacts newItem){
        int pos = findItem(currentItem);
        if(pos>=0){
            modifyList(pos,newItem);
        }
    }
    public void modifyList(int pos,Contacts newItem){
        myContacts.set(pos,newItem);
        System.out.println(newItem + " has been added");
    }
    // method for removing an item
    public boolean removeItem(Contacts item){
        int pos = findItem(item);
        if(pos>=0){
            this.myContacts.remove(pos);
            System.out.println(item + " was deleted");
            return true;
        }
        else System.out.println(item + " was not found");
        return false;
    }

    //getter for list
    public ArrayList<Contacts> getMyContacts(){
        return myContacts;
    }
    //method for finding if an item is there or not

    public String queryContact(Contacts contact){
        if(findItem(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Contacts queryContact(String name){
        int pos = findItem(name);
        if(pos >= 0){
            return this.myContacts.get(pos);
        }
        return null;
    }
    //print contacts
    public void printContacts(){
        System.out.println("Contact List");
        for(int i = 0 ;i<myContacts.size();i++){
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> "+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

}
