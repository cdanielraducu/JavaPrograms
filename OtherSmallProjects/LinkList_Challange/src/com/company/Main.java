package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> myAlbums = new ArrayList<Album>();

    public static void main(String[] args) {
	//Create a program that implements a playlist for songs
        // Create a song class having Title and Duration for a song
        //The program will have an Album Class containing a list of songs
        //Songs from different albums can be added to the playlist and will
        //appear in the list in the order added.
        //Once the songs have been added to the playlist, create a menu of options to:
        //-quit, skipforward to the next song, skip backwards to a previous song.
        //replay that current song. List the song in the playlist.
        //A song must exist in an album before it can be added to the playlist
        //(so you can only play songs that you own)
        //Hint: to replay a song, consider what happened when we went back and
        // forth from a city before we started tracking the direction we were going.
        //As an optional extra, provide an option to remove the current song
        //from the playlist
        // (hint: listIterator.remove()



        Album album = new Album("rock");
        album.addSong("Gun's & roses", 300);
        album.addSong("Backway", 300);
        album.addSong("Alltheway", 300);
        album.addSong("American dream", 300);
        album.addSong("Oh, gravity!", 300);
        myAlbums.add(album);

        //album = new Album("hiphop");
        //album.addSong("Heyaa",250);
        //album.addSong("XPLOIT",250);
        //album.addSong("AMIGOS",250);
        //album.addSong("BOOM",250);
        //album.addSong("COOL",250);
        //myAlbums.add(album);


       // LinkedList<Song> playList = new LinkedList<Song>();
        //myAlbums.get(0).addToPlayList("Backway",playList);
        //myAlbums.get(0).addToPlayList("NONONO",playList);
        //myAlbums.get(0).addToPlayList("American dream",playList);
        //myAlbums.get(0).addToPlayList(2,playList);
        //myAlbums.get(1).addToPlayList(3,playList);
        //myAlbums.get(1).addToPlayList(4,playList);

        //play(playList);


    }
    private static void play(LinkedList<Song> playList){
        // + FORWARD/BACKWARDS/REPLAY/AND ...
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0 ){
            System.out.println("No songs in playlist"); return;

        }else{
            System.out.println("Now playing " + listIterator.next().getTitle());
        }

    }


}
