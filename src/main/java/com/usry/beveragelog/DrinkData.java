package com.usry.beveragelog;

import com.usry.beveragelog.forms.Drink;

import java.util.ArrayList;

public class DrinkData {

    static ArrayList<Drink> drinks = new ArrayList<>();

    // getAll
    public static ArrayList<Drink> getAll() {
        return drinks;
    }

    // add
    public static void add(Drink newDrink) {
        drinks.add(newDrink);
    }



    // getById
    public static Drink getById(int id) {

        Drink theDrink = null;

        for (Drink candidateDrink : drinks) {
            if (candidateDrink.getId() == id) {
                theDrink = candidateDrink;
            }
        }

        return theDrink;
    }
}
