package com.company;

public class Main {

    public static void main(String[] args) {
        int count =0;
        for(int i=10;i<50;i++){
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + "is a prime number");
                if(count == 10){
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n) ; i++) {
            System.out.println("Looping " + i);
        if (n % i == 0) {
            return false;
            }
        }
        return true;
    }
}
