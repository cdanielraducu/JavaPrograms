package com.company;
import java.util.Scanner;

public class Main {
private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	int[] var = new int[10];
	int[] vr = {1,2,3,4,5,6,7,8,9,10};
	int[] v = getIntegers(10);
	printArray(v);
    System.out.println("The avg is "+getAvg(v));
    }
    public static void printArray(int[] array){
    	for(int i=0;i<10;i++){
    		System.out.println("#"+i+"  "+array[i]);
		}
	}
	public static int[] getIntegers(int n){
    	System.out.println("enter " + n+ " integer values \r");
    	int[] v = new int[n];
    	for(int i =0;i<v.length;i++){
    		v[i] = input.nextInt();
		}
    	return v;
	}
	public static double getAvg(int[] v){
    	int sum =0;
    	for(int i=0;i<v.length;i++){
    		sum+=v[i];
		}
    	return (double)sum/ (double) v.length;
	}
}
