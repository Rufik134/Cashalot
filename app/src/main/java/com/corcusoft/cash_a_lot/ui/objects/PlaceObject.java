package com.corcusoft.cash_a_lot.ui.objects;

/**
 * Created by Rufat on 4/22/18.
 */

public class PlaceObject {
    private String name;
    private double amount;
    private String valute;
    private int id;

    public PlaceObject(String name, double amount, String valute, int id) {
        this.name = name;
        this.amount = amount;
        this.valute = valute;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getValute() {
        return valute;
    }

    public int getId() {
        return id;
    }
}
