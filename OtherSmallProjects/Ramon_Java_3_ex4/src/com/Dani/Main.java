package com.Dani;

public class Main {


    public static void main(String args[]) {

    int count = 0,i;
    String[] input = "Astazi invatzi java si zilnic fac aplicatii practice".split("\\s+");
    int l = input.length;
    for(i = 0; i+1 < l ; i++)
          if( (input[i].contains("zi")))
              count++;
        System.out.println("s-au gasit " + count );
    }
    }


