package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("No action take, no button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering...");
        isRinging = false;
    }
}
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring ...");
        }else{
            isRinging = false;
            System.out.println("mobile not on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }
}
