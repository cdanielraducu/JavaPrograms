package com.Dani;

public class Password {
    private static final int key =  748576362;
    private final int encryptedPass;

    public Password(int password) {
        this.encryptedPass = encryptDecrypt(password);
    }
    private int encryptDecrypt(int pass) {
        return pass ^ key;
    }
    public final void storePass(){
        System.out.println("saving pass as " + this.encryptedPass);
    }
    public boolean letMeIn(int pass){
        if(encryptDecrypt(pass) == this.encryptedPass){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("nope");
            return false;
        }
    }

}
