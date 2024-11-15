package org.example;

public class Main {
    public static void main(String[] args) {
        //logical operators
        //AND
        int temp=12;
        boolean tem=temp<=12 && temp>13;
         System.out.println(tem);
         //OR
        boolean highincome=true;
        boolean credits=true;
        boolean criminalrecords=false;
        boolean eligibility=(highincome||credits) && !criminalrecords;
        System.out.println(eligibility );
    }
}