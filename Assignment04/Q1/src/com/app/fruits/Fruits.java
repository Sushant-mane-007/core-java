package com.app.fruits;

import static com.app.fruits.FruitBasket.arr;

public class Fruits {
     private String color;
     private double weight;
     private String name;
     private boolean isFresh;

    public Fruits(String color, double weight, String name, boolean isFresh) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }



//    public Fruits(String color, double weight, String name) {
//        this.color = color;
//        this.weight = weight;
//        this.name = name;
//    }


    public Fruits(boolean isFresh) {
        this.isFresh = isFresh;
    }

    public Fruits(){
        for(Fruits f:arr)
            System.out.println();
    }

//    public Fruits(String color, double weight, String name, Boolean o) {
//    }

    @Override
    public String toString() {
        return "Fruits{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                "isFreash=" + isFresh+
                '}';
    }




    public String taste(){
        return "No specific taste";
    }

    public Fruits(String name) {
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }
}
