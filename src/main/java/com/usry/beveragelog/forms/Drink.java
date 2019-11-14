package com.usry.beveragelog.forms;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.File;


@Entity
public class Drink {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private int rating;
    private File file;


    public Drink(String name, String description, Integer rating, File file) {
        this();
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.file = file;
    }

    public Drink() {

    }

    public int getId() {
        return id;
    }

    public File getFile() {
        return file;
    }

    public void setPicture(File file) {
        this.file = file;
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
