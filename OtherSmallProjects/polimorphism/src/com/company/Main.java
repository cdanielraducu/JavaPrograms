package com.company;

class Movie {
    private String name;
    public Movie(String name){
        this.name=name;
    }
    public String plot(){
        return "no plot here";
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Sharks";
    }
}
class JackieChan extends Movie{
    public JackieChan(){
        super("Kung fu");
    }
    public String plot(){
        return "BOOM";
    }
}
class Terminator extends Movie{
    public Terminator(){
        super("Explosions");
    }
    public String plot(){
        return "Robots";
    }
}
class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }
    public String plot(){
        return "kids try and escape a maze";
    }
}
class forgetable extends Movie{
        public forgetable(){
            super("Forgetable");
        }
}

public class Main {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Movie movie = randomMovie();
            System.out.println("Movies #" + i +
                    ": " + movie.plot());
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println(randomNumber);
        switch(randomNumber){
            case 1 : return new Jaws();
            case 2 : return new JackieChan();
            case 3 : return new Terminator();
            case 4 : return new MazeRunner();
            case 5 : return new forgetable();
            default : return null;
        }
    }
}
