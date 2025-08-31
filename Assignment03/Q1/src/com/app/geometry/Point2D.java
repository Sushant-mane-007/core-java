package com.app.geometry;

import java.util.Scanner;

public class Point2D {
    private double x;
    private double y;
    private double x3;
    private double y3;

    Scanner sc = new Scanner(System.in);
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public Point2D(double x, double y, double x3, double y3) {
        this.x = x;
        this.y = y;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void display(){
        System.out.println("point 1 :"+"("+getX() + "," + getY()+")");
        System.out.println("point 2 :"+"("+getX3() + "," + getY3()+")");

    }

    public boolean isEqual(){
        if(this.getX() == this.getY() ){
            return  true;
        }else{
            return false;
        }
    }

    public void calculateDistance(){
        System.out.println("Enter current coordinates : ");
        System.out.println("Enter x coordinate : ");
        double x1 = sc.nextDouble();
        System.out.println("Enter y coordinate : ");
        double y1 = sc.nextDouble();
        System.out.println("Enter destination coordinates : ");
        System.out.println("Enter x coordinate : ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y coordinate : ");
        double y2 = sc.nextDouble();

        System.out.println("Total distance is : " + Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)) );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
