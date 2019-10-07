package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    int[] x = getX(3);
    printArray(x);
    System.out.println("the minimum values is: " + findMin(x));
    reverse(x);
    printArray(x);
    }
    public static int[] getX(int n){
        int[] x = new int[n];
        System.out.println("Enter " + n + " values: \r");
        for(int i = 0; i < n; i++ )
        {
            x[i] = scanner.nextInt();
        }
        return x;
    }
    public static void printArray(int[] x){
        for(int i = 0 ; i < x.length-1 ; i++ ){
            System.out.print(x[i] + " ");
        }
        System.out.println(x[x.length-1]);
    }
    public static int findMin(int[] x){
        int min = x[0];

        for(int i = 1 ; i < x.length ; i++ ) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }
    public static void reverse(int[] x ){
        int[] y =new int[x.length];
        int k = 0;
        for(int i = x.length - 1 ; i >=0 ; i--) {
            y[k++] = x[i];
        }
        for(int i = 0 ;i< x.length ; i++ ){
            x[i]=y[i];
        }
    }
    public static void reverse_v2(int[] x){
        int maxIndex = x.length - 1;
        int halfLength = x.length/2;
        for(int i = 0; i<halfLength; i++){
            int temp = x[i];
            x[i] = x[maxIndex - i];
            x[maxIndex - i] = temp;
        }
    }
}
