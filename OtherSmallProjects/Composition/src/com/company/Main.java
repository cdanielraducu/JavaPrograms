package com.company;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
		System.out.println(toMilesPerHour(2));
    	long aux;
    }
    public static double toMilesPerHour(double kilometersPerHour){
    	kilometersPerHour = (long)kilometersPerHour*1.6;
    	return Math.ceil(kilometersPerHour);
	}
}
