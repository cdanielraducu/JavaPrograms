package com.Dani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        scanner.nextLine();

        int[] sir = new int[n];
        for(int i = 0; i<n; i++){
            sir[i] = scanner.nextInt();
        }
        //afisare(sir,n);
        int aux = 0;
        //sortare_prin_insertie(sir,n);
        //System.out.println();
        //afisare(sir,n);
        //permutare(sir,4,2);
        //System.out.println();
        //System.out.println();
        //afisare(sir,n);
        //System.out.println(cautare_secventiala(2,n,sir));
        //System.out.println(cautare_binara(2,0,n-1,sir));
    }
    public static void afisare(int[] sir, int n){
        for(int i = 0; i<n; i++){
            System.out.print(sir[i] + " ");
        }
    }
    public static void sortare_prin_interschimbare(int[] sir,int n){
        int aux = 0;
        for(int i = 0;i < n; i++){
            for(int j  = i; j<n; j++){
                if(sir[i]>sir[j]){
                    aux = sir[i];
                    sir[i] = sir[j];
                    sir[j] = aux;
                }
            }
        }
    }
    public static void sortare_bubblesort(int[] sir, int n){
        int aux = 0;
        for(int i = 0;i < n; i++){
            for(int j  = 0; j<n-1; j++){
                if(sir[j]>sir[j+1]){
                    aux = sir[j];
                    sir[j] = sir[j+1];
                    sir[j+1] = aux;
                }
            }
        }
    }
    public static void sortare_prin_insertie(int[] sir, int n){
        int aux = 0; int j = 0;
        for(int i =1; i<n;i++){
            aux = sir[i];
            j = i-1;
            while((j >= 0) &&(aux<sir[j])){
                sir[j+1] = sir[j];
                j = j-1;
            }
            sir[j+1] = aux;
        }

    }

    public static int cautare_binara(int x,int l, int r, int[] sir){
        if(r>=l){
            int mid = l+(r-l)/2;

            if(sir[mid] == x){
                return mid;
            }

            if(sir[mid] > x){
                return cautare_binara(x,l,mid-1,sir);
            }
            return cautare_binara(x,mid+1,r,sir);
        }
        return -1;

    }
    public static int cautare_secventiala(int x, int n, int[] sir){
        for(int i = 0;i<n;i++){
            if(sir[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void permutare(int[] sir, int n,int d){
        int aux = 0;
        for(int i = n-1; i>=d ;i--){
            if(i == n-1){
                aux = sir[i];
            } else if(i == d){
                sir[i+1] = sir[i];
                sir[d]=aux;
            } else {
                sir[i+1] = sir[i];
            }
        }
    }
}
