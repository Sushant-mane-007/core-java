package Tester;

import com.app.geometry.Point2D;

import java.awt.*;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point2D p2 = new Point2D();
        System.out.println("Enter current coordinates : ");
        System.out.println("Enter x coordinate : ");
        p2.setX( sc.nextDouble());
        System.out.println("Enter y coordinate : ");
        p2.setY( sc.nextDouble());
        System.out.println("Enter destination coordinates : ");
        System.out.println("Enter x coordinate : ");
        p2.setX3( sc.nextDouble());
        System.out.println("Enter y coordinate : ");
        p2.setY3( sc.nextDouble());
      ///  p2.display();

        if((p2.getY() == p2.getY3())  && (p2.getX()==p2.getX3())){
            p2.display();
            System.out.println(p2.isEqual());
        }else{
            System.out.println("Total distance is : " + Math.sqrt((p2.getY3() - p2.getY()) * (p2.getY3() - p2.getY()) + (p2.getX3() - p2.getX()) * (p2.getX3() - p2.getX())) );

        }



    }
}
