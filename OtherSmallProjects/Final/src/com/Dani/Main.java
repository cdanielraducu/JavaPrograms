package com.Dani;

public class Main {

    public static void main(String[] args) {
		System.out.println("Main method called");
		STBTest test = new STBTest();
		test.someMethod();
		System.out.println("Owner is " + STBTest.owner);
    }
}
