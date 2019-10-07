package com.company;
import java.util.Scanner;
//se poate face mai misto, daca gen faci sa dai get input la ce spatiu a mai ramas in array
public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] V = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter numbers(10)");
        getInput();
        printArray(V);
        resizeArray();
        System.out.println("Enter numbers(12)");
        getInput();
        printArray(V);
    }

    private static void getInput(){
        for(int i = 0;i< V.length;i++){
            V[i]= s.nextInt();
        }
    }
    private static void printArray(int[] arr){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    private static void resizeArray(){
        int[] original = V;
        V = new int[12];
        for(int i = 0;i< original.length;i++){
            V[i] = original[i];
        }
    }

}
