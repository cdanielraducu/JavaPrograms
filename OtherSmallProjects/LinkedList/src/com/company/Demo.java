package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        LinkedList<String> placetoVisit = new LinkedList<String>();
        addInOrder(placetoVisit, "Sidney");
        addInOrder(placetoVisit, "NY");
        addInOrder(placetoVisit, "Paris");
        addInOrder(placetoVisit, "Rome");

        printList(placetoVisit);
        placetoVisit.remove(3);
        visit(placetoVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting" + i.next());
        }
        System.out.println("=========================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal do not add
                return false;
            }else if(comparison > 0){
                //new City appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison<0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator  = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("no"); return;
        }
        else{
            System.out.println("Now visiting " + listIterator.next());
            //printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                //...
                //case 1: if(!goingforward) { if(listIterator.hasNext()){ listIterator.next();))
                //Linkedlist part 3 + CHallange linkedList
        }
    }
}
