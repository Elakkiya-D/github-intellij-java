package org.example;

public class Main {
    public static void main(String[] args) {
      //if
        int age=90;
        if(age<=18){
            System.out.println("your are an adult");
        }
        else if (age==18){
            System.out.println("your 18");
        }
        else if(age==90){
            System.out.println("your age is 90");
        }
        else {
            System.out.println("your not an adult");
        }

    }
}