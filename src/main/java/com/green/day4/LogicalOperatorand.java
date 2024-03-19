package com.green.day4;

public class LogicalOperatorand {
    public static void main(String[] args) {
        // int val = 1 / 0;
        if(true && true && true) {
            System.out.println("true && true && true");
        }
        boolean r = true && true && true;
        System.out.println("r : " + r);

        boolean r2 = true && true && false;
        System.out.println("r2 : " + r2);

        boolean r3 = true && true && true && true;
        System.out.println("r3 : " + r3);

        boolean r4 = true && true && true && false;
        System.out.println("r4 : " + r4);
    }
}
