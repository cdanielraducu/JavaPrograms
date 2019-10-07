package com.company;

public class Main {

    public static void main(String[] args) {

        long start = System.nanoTime();
        Integer a = new Integer(2);
        Integer b = new Integer(3);
        System.out.println(a + b);
        long endtime = System.nanoTime();

        System.out.println((endtime - start)/1000000);

    }


}
