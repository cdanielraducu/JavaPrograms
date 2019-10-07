package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Love",4.22);
        album.addSong("Holy",3);
        album.addSong("You can",2.8);
        album.addSong("High ball",4.8);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("Rocker",3.4);
        album.addSong("YOOr",3.7);
        album.addSong("ROLL",3);
        album.addSong("STK8",3.5);
        album.addSong("BUMPER",5);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Stormbringer",playList);
        albums.get(0).addToPlayList("Lover",playList); // does not exist
        albums.get(0).addToPlayList("Love",playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(5,playList);
        albums.get(1).addToPlayList(3,playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complet");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the list");
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;

                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("we are the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0 ){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());

                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }


    private static void printMenu(){
        System.out.println("available actions: \n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n" +
                "2 - to play the previous song\n"+
                "3 - to replay the current song\n"+
                "4 - to list songs in the playlist\n"+
                "5 - to print available actions\n" +
                "6 - to remove the current song.");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("==========================");
    }













}
