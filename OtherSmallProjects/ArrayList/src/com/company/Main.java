package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LIST MyList = new LIST();
    public static void main(String[] args) {
	boolean quit = false;
	int choice = 0;
	printInstruction();
	while(!quit){
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 0:
                printInstruction();
                break;
            case 1:
                MyList.printArray();
                break;
            case 2:
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5: searchForItem();
                break;
            case 6: processArrayList();
            break;
                case 7: quit = true;
            break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of items");
        System.out.println("\t 2 - tp add an item to the list");
        System.out.println("\t 3 - to modify an item ");
        System.out.println("\t 4 - to remove an item ");
        System.out.println("\t 5 - to search an item ");
        System.out.println("\t 6 - to quit the app ");

    }

    public static void addItem(){
        System.out.println("enter item ");
        MyList.AddListItem(scanner.nextLine());

    }

    public static void modifyItem(){
        System.out.println("enter item number: ");
        String itemNr = scanner.nextLine();
        System.out.println("enter replacement item: ");
        String newItem = scanner.nextLine();
        MyList.modifyList(itemNr, newItem);
    }

    public static void removeItem(){
        System.out.println("enter item: ");
        String itemNr = scanner.nextLine();
        MyList.removeItem(itemNr);

    }

    public static void searchForItem(){
        System.out.println("item to search for: ");
        String searchItem = scanner.nextLine();
        if(MyList.onFile(searchItem)){
            System.out.println("Found "+ searchItem + " in the list");
        }
        else System.out.println(searchItem + "is not in the list");
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(MyList.getMyList());

        ArrayList<String> nextArray = new ArrayList<String>(MyList.getMyList());

        String[] myArray= new String[MyList.getMyList().size()];
        myArray = MyList.getMyList().toArray(myArray);
    }




}
