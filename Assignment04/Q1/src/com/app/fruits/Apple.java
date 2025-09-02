package com.app.fruits;

public class Apple extends Fruits {

    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Apple(String color, double weight, String name, boolean isFresh) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }

    public Apple(){

    }
    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public String taste(){
        return "Sweet n Sour";
    }

    public Apple(boolean isFresh) {
        this.isFresh = isFresh;
    }
}
