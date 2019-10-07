package com.Dani;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String magazine = "give me one grand today night";
        String note = "give one grand today";

        String[] arrOfMagazine = magazine.split(" ");
        String[] arrOfNote = note.split(" ");

        Map<String, Integer> helper = new HashMap<>();
        for(String s : arrOfMagazine){
            if(!helper.containsKey(s)){
                helper.put(s,1);
            } else{
                helper.put(s,helper.get(s)+1);
            }
        }
        for(String s : arrOfNote){
            if(helper.containsKey(s)) {
                helper.put(s, helper.get(s) - 1);
                if (helper.get(s) < 0) {
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("yes");
    }
}
