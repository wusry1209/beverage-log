package com.usry.beveragelog.forms;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.File;
import java.util.Base64;


@Entity
public class Drink {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private int rating;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;


    public Drink(String name, String description, Integer rating, byte[] foto) {
        this();
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.foto = foto;
    }

    public Drink() {

    }

    public String getImageString(){
        String s = Base64.getEncoder().encodeToString(foto);
        return s;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
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
