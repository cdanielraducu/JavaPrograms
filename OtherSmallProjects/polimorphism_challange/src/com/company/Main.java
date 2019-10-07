package com.company;

class CarBase{
    private String name;
    private int POWER;
    private String traction;
    public CarBase(String name,int POWER, String traction){
    this.name = name;
    this.POWER = POWER;
    this.traction = traction;
    }
    //return

    public String accelerate(){
        return "this ain't no car";
    }
}
class Audi extends CarBase{
    public Audi(){
     super("S1",275,"quattro");
    }
    public String accelerate(){
        return "yea kind of fast";
    }
}
class Bmw extends CarBase{
    public Bmw(){
        super("120M",420,"Xdrive");
    }
    public String accelerate(){
        return "wow this thing flies";
    }
}

public class Main {

    public static void main(String[] args) {
            for(int i =0; i< 5; i++){
                    CarBase car = randomNumber();
                    System.out.println(car.accelerate());
            }
    }
    public static CarBase randomNumber(){
        int x = (int)(Math.random() *2) + 1;
        switch(x){
            case 1 : return new Audi();
            case 2 : return new Bmw();
            default :  return null;
        }
    }
}
