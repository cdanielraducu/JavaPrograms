package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] v = new int[5];
	setV(v);
	getV(v);
    sortV(v);
    getV(v);
    }
    public static void setV(int[] v){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<v.length;i++){
            v[i] = input.nextInt();
        }
    }
    public static void getV(int[] v){
        for(int i = 0;i<v.length;i++){
            System.out.println("#"+(i+1)+ " "+v[i]);
        }
    }
    public static void sortV(int[] v){
        int aux;
        for(int j=0;j<v.length;j++)
            for (int i = 0; i < v.length-1; i++)
                if (v[i] < v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
        }
    }

