package com.green.day2;

public class Missionrandomvalue {
    public static void main(String[] args) {

        int n;
        n = (int)(Math.random() * 13);

        if (n >= 5) {
            System.out.println(n);
        }

        System.out.println("---------------");

        int m,i;

        for(i=0; i<100; i++) {
            m = (int) (Math.random() * 10) + 3;

            if (m >= 5) {
                System.out.println(m);
            }
        }
    }
}

