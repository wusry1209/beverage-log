package com.usry.beveragelog.forms;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Drink {

    private int id;
    private String name;
    private String description;
    private int rating;
    private static int nextId = 1;

    public Drink(String name, String description, Integer rating) {
        this();
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public Drink() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
