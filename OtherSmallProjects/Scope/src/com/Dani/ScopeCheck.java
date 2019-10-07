package com.Dani;

public class ScopeCheck {
    public int publicVar =0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck createad, publicVar = " +
                publicVar + ": varOne = "+ privateVar);
    }

    public int getPrivateVar() {
        return varOne;
    }

    public void TimesTwo(){
        int var2 = 2;
        for(int i =0;i<10;i++){
            System.out.println(i + " times two is " + i * var2);
        }
    }
    public class InnerClass{
        public int var3 =3;
        public InnerClass(){
            System.out.println("InnerClass created, var3 is "+ var3);
        }
        public void timesTwo(){
                ScopeCheck.this.TimesTwo();
            for(int i = 0;i<10;i++){
                System.out.println(i + " times two is " + i*ScopeCheck.this.privateVar);
            }
        }
    }
}
