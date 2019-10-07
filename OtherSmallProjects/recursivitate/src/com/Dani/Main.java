package com.Dani;

public class Main {

    public static void main(String[] args) {
	String s = "abc";
	afiasre(s,"");
    }
}
    public static class PER {
        public static void afisare(String s, String ans) {
            if (s.length() == 0) {
                System.out.println(ans + "");
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                String ros = s.substring(0, i) + s.substring(i + 1);
                afisare(ros, ans + ch);
            }
        }
    }
