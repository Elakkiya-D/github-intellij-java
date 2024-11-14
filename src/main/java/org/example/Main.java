package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("name= ");
        String name=scanner.nextLine();
        System.out.println("what is your age?");
        int age=scanner.nextInt();
        //important to notice
        scanner.nextLine();
        System.out.println("whats your fav dish");
        String favfood= scanner.nextLine();
        System.out.println("name="+name);
        System.out.println("age:"+age);
        System.out.println("my fav dish is:"+favfood);
        }

}