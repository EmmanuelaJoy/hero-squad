package models;

import java.util.ArrayList;
import java.util.List;

public class Squads {
    private String name;
    private String cause;
    private int maxSize;
    private ArrayList<Heroes> heroes;
    private static List<Squads> squadInstances = new ArrayList<>();

    public Squads(String name, String cause, int size, ArrayList<Heroes> heroes){
        this.name =name;
    }

    public String getName() {
        return this.name;
    }
}