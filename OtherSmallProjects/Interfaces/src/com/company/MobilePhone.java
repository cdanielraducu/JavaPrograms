package com.company;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    public boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone ON");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
        System.out.println("Now ringing " + phoneNumber);
        }else{
            System.out.println("Phone is switched off");
        }
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
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ring Ring ...");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }

}
