package com.app.fruits;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FruitBasket {
     int size;
     int  index = 0 ;
     static ArrayList<Fruits> arr= new ArrayList<>();
     static int j ;



    public static int menu(Scanner sc){
        System.out.println("0. Exit");
        System.out.println("1. Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Display names of all Fruits");
        System.out.println("5. Display all info of fruits");
        System.out.println("6. Display taste of all not fresh fruits    ");
        System.out.println("7. Set friut as stale");
        return sc.nextInt();
    }
    public static void Add(Scanner sc,String name2) {

         String  name  = name2;
        System.out.println("Enter the color of product");
        String color = sc.next();
        System.out.println("Enter the weight of product");
        double weight = sc.nextDouble();
        boolean b= true;
        arr.add(new Fruits(color,weight,name,true));
    }

    public static void Display(){
        System.out.println(arr);
    }
    public static void DisplayName(){
          for(Fruits f:arr)
              System.out.println("fruits are : " + f.getName());
    }

    public static void MarkStale(Scanner sc){
        int i = 0;
         for(Fruits f: arr ) {
             System.out.println(i + " " + arr.get(i));
             i++;
         }

        System.out.println("enter index of stale fruit");
         j = sc.nextInt();
         arr.get(j).setFresh(false);
    }
    public static void DisplayStale(){

        for(Fruits f:arr){
            if(f.isFresh()){

            }else{

                if(f.getName().equals("Mango")) {
                    f = new Mango();

                    System.out.println( f.taste());
                    break;
                }else if(f.getName().equals("Apple")){
                    f = new Apple();
                    System.out.println( f.taste());
                        break;
                }else{
                    f = new Orange();

                    System.out.println( f.taste());
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        while ((choice = menu(sc))!= 0){
                switch (choice){
                    case 1:
                        Add(sc,"Mango");
                        break;
                    case 2:
                        Add(sc,"Orange");
                        break;
                    case 3:
                        Add(sc,"Apple");
                    case 4:
                        DisplayName();
                        break;
                    case 5:
                        Display();
                        break;
                    case 6:
                        DisplayStale();
                        break;
                    case 7:
                        MarkStale(sc);
                        break;
                    default:
                        System.out.println("u entered wrong choice");
                }
        }


    }


}
