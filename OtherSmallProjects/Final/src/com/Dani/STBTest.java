package com.Dani;

public class STBTest {
    public static final String owner;

    static{
        owner = "Dani";
        System.out.println("STBTest static initiliaztion block called");
    }

    public STBTest(){
        System.out.println("STB constructor called");
    }
    static{
        System.out.println("2nd initiliaztion block called");
    }
    public void someMethod(){
        System.out.println("SomeMethod called");
    }
}
