package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Squads {
    private String name;
    private String cause;
    private int maxSize;
    private ArrayList<Heroes> heroes;
    private static List<Squads> squadInstances = new ArrayList<>();

    public Squads(String name, String cause, int size, ArrayList<Heroes> heroes){
        this.name =name;
        this.cause=cause;
        this.maxSize=size;
        this.heroes=heroes;
        squadInstances.add(this);
    }

    public String getName() {
        return this.name;
    }

    public String getCause() {
        return this.cause;
    }

    public int getSize() {
        return this.maxSize;
    }

    public ArrayList<Heroes> getHeroes() {
        return this.heroes;
    }

    public static List<Squads> getSquadInstances() {
        return squadInstances;
    }
}