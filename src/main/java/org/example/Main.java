package org.example;

public class Main {
    public static void main(String[] args) {
        //type conversion/casting
       double x=6.666;
       int y=(int)x+1;
       System.out.println(y);
      //uncompatiple
        String number="6";
        int num=Integer.parseInt(number)+10;

        System.out.println(num);
        //constants
        final float PI=3.14f;
        System.out.println(PI);
          }
}