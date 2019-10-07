package com.Dani;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance var1 is = "+ scopeInstance.getPrivateVar());
        System.out.println(varFour);
        scopeInstance.TimesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
