package org.example;

import java.util.Scanner;
 class car {
     String colour = "red";
     double Price = 20000.00;
     String model = "swift";
     int year = 2024;

     void drive() {
         System.out.println("you can drive a car");
     }

      void brake() {
         System.out.println("you can stop");
     }
 }
    public class Main {
    public static void main(String[] args){
     car mycar=new car();
        car mycar2=new car();

     System.out.println(mycar.model);
     System.out.println(mycar.Price);
        System.out.println(mycar2.model);
        System.out.println(mycar2.Price);
     mycar.drive();
     mycar.brake();
        mycar2.drive();
        mycar2.brake();


    }



    }

