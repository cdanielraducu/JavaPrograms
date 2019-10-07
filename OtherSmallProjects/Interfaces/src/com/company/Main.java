package com.company;

public class Main {

    public static void main(String[] args) {
           // ITelephone timsPhone;
            //timsPhone = new DeskPhone(123456,1);
            //timsPhone.powerOn();
            //timsPhone.callPhone(123456);
            //timsPhone.answer();

            ITelephone Phone;
            Phone = new MobilePhone(36);
            Phone.powerOn();
            Phone.callPhone(36);
            Phone.answer();
            //challange
    }

}
