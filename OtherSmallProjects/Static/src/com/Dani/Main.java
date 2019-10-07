package com.Dani;

public class Main {
       static public int x = 7;
    public static void main(String[] args) {

        //java.com.company._static.Main
        int answer = multiply(6);
        System.out.println("the answer is " + answer);
        }
        static public int multiply(int number ){
        return number * x;
        }
}
