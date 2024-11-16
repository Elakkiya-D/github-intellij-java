package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   Scanner scan= new Scanner(System.in);
        System.out.println("press Q or q to quit the game");
        String response=scan.next();
        if(response.equals("q") || response.equals("Q")){
            System.out.println("you quit the game");
        }
        else {
            System.out.println("your still playing");
        }*/
        Scanner scan= new Scanner(System.in);
        System.out.println("press Q or q to quit the game");
        String response=scan.next();
        if(response.equals("q") && !response.equals("Q")){
            System.out.println("you quit the game");
        }
        else {
            System.out.println("your still playing");
        }


    }
}