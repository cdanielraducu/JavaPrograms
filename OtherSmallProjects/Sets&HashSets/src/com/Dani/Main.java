package com.Dani;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new Planet("Mercury",88);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Venus",225);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("Earth",365);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new MOON("Moon",27);
        solarSystem.put(tempMoon.getKey(),tempMoon);
        temp.addSatellite(tempMoon);

        System.out.println("planets");

        for(HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getKey());
        }
        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Eart", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moon of " + body.getKey());
        for(HeavenlyBody earthMoon: body.getSatellites()){
            System.out.println("\t" + earthMoon.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\t" + moon.getKey());
        }


        HeavenlyBody earth1 = new Planet("Earth",365);
        HeavenlyBody earth2 = new Planet("Earth",365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
    }
}
