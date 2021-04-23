package models;

import java.util.ArrayList;

public class Heroes {

    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<Heroes> instances = new ArrayList<>();
    private static int id;
    private boolean squadMember;

    public Heroes(String name, int age, String power, String weakness) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
}