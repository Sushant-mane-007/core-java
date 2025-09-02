package com.app.fruits;

public class Mango extends Fruits {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Mango() {
    }

    public Mango(String color, double weight, String name, boolean isFresh) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }

    public Mango(String name, boolean isFresh) {
        this.name = name;
        this.isFresh = isFresh;
    }

    public Mango(String color, double weight, String name) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String taste(){
        return "sweet";
    }

    public Mango(boolean isFresh) {
        this.isFresh = isFresh;
    }
}
