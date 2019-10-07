package com.Dani;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("452");

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            Contacts newContact = Contacts.createContact(name, phoneNumber);
            if (mobilePhone.Add(newContact)) {
                System.out.println("new c added:  " + newContact.getName() + newContact.getPhoneNumber());
            } else
                System.out.println("already on file");
        }
        mobilePhone.printContacts();
        Contacts existingContactrecord = mobilePhone.queryContact("Tim");
        if(existingContactrecord == null){
            System.out.println("was not found");
        }
        Contacts newContact = Contacts.createContact("Narcis","222");
        if(mobilePhone.updateContact(existingContactrecord,newContact))
            System.out.println("succesfull");
        mobilePhone.printContacts();

        Contacts existingContactrecord2 = mobilePhone.queryContact("Narcis");
        if(mobilePhone.removeItem(existingContactrecord2)){
            System.out.println("deleted");
        }
        mobilePhone.printContacts();
    }
}
