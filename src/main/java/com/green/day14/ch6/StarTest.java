package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5); //*****(개행)
        star.singlePrint(7); //*******(개행)
        System.out.println("-------------------------");
        star.squarePrint(5);
        System.out.println("---------------------");
        star.trianglePrint(4);
        System.out.println("---------------");


    }
}

class Star {
    void singlePrint(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    void squarePrint(int n) {
        for(int i = 0; i < n; i++) {
            singlePrint(n);
        }
    }
    void trianglePrint(int n) {
        for(int i = 1; i <= n; i++) { //1234
            singlePrint(i);
        }
    }
}