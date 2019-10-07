package com.company;


import java.util.ArrayList;
public class LIST {
    private ArrayList<String> MyList = new ArrayList<String>();

    public void AddListItem(String item){
        MyList.add(item);
    }

    public void modifyList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyList(position,newItem);
        }
    }
    private void modifyList(int position, String newItem){
        MyList.set(position,newItem);
        System.out.println("MyList item " + (position+1) +
                " has been modified ");
    }
    public ArrayList<String> getMyList() {
        return MyList;
    }

    public void printArray(){
        System.out.println("you have " + MyList.size() +
                "items in your list");
        for(int i = 0;i< MyList.size();i++){
            System.out.println((i+1) + "." + MyList.get(i));
        }
    }
    public void removeItem(String item){
        int position = findItem(item);
        if(position >=0){
            removeItem(position);
        }
    }

    private void removeItem(int position){
        MyList.remove(position);

    }

    private int findItem(String searchItem){
        return MyList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
