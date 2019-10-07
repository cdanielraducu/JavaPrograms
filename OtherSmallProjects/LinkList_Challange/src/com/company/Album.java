package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    ArrayList<Song> mySongs;

    public Album(String name){
        this.mySongs = new ArrayList<Song>();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int findSong(String songName){
        for(int i = 0 ;i< mySongs.size(); i++){
            Song existingSong = this.mySongs.get(i);
            if(existingSong.getTitle().equals(songName)){
                System.out.println(songName + " found...");
                return i;
            }
        }
        System.out.println(songName + " was not found");
        return -1;
    }
    public boolean addSong(String songName,int duration){
        int pos = findSong(songName);
        if(pos < 0 ){
            mySongs.add(new Song(songName,duration));
            return true;
        }
        System.out.println("Song is already added");
        return false;
    }
    public boolean removeSong(String songName){
        int pos = findSong(songName);
            if(pos < 0){
                System.out.println("Song doesn't exist");
            return false;
        }
        System.out.println("Song: " + songName + " was deleted");
        mySongs.remove(pos);
        return true;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if((index >= 0 ) && (index <=this.mySongs.size()))
        {
            playlist.add(this.mySongs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        int pos = findSong(title);
        if(pos < 0 ){
            System.out.println(title + " was not found");
            return false;
        }
        Song checkedSong  = mySongs.get(pos);
        playlist.add(checkedSong);
        return true;

    }
}
