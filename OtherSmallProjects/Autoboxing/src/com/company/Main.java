package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    class IntClass{
        private int myValue;
        public intClass(int myValue){
            this.myValue = myValue;
        }
        public int getMyValue(){
            return myValue;
        }
        public void setMyValue(int myValue){
            this.myValue = myValue;
        }
    }
    public static void main(String[] args) {
	String[] strArray = new String[10];
	int[] intArray = new int[10];

	//ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
	//intClassArrayList.add(new IntClass(54));
	Integer integer = new Integer(54);


        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        //boxing
        for(int i = 0;i<10;i++){
            integerArrayList.add(Integer.valueOf(i));
        }
        //unboxing
        for(int i =0;i<10;i++){
            System.out.println(i + "->"+ integerArrayList.get(i).intValue());
        }
        Integer myIntValue = 56; // Integer.valueof(56);
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        //autoboxing challange


    }
}
