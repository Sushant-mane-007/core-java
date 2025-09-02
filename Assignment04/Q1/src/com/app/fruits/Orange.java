package com.app.fruits;

public class Orange extends Fruits {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Orange() {
    }

    public Orange(String color, double weight, String name, boolean isFresh) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }

    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Orange(boolean isFresh) {
        this.isFresh = isFresh;
    }

    public String taste(){
        return "Sour";
    }
}
