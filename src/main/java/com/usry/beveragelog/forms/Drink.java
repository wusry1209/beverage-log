package com.usry.beveragelog.forms;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Drink {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private int rating;


    public Drink(String name, String description, Integer rating) {
        this();
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public Drink() {

    }

    public int getId() {
        return id;
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
