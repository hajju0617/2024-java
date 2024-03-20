package com.green.day5.ch2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("x : " + x + " y : " + y);

        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x : " + x + " y : " + y);

    }
}
