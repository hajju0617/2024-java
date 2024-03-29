package com.green.day12.ch6;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10);
        mm.checkOddEven(11);
        mm.checkOddEven(100);
        mm.checkOddEven(13);
        System.out.println("-------------------------------");
        int r = mm.abs(10);
        System.out.println(r);
        r = mm.abs(-8);
        System.out.println(r);
        System.out.println("-------------------------------");
        int randomValue = mm.getRandomValue(10);
        System.out.println(randomValue);
        randomValue = mm.getRandomValue(100);
        System.out.println(randomValue);
        System.out.println("-------------------------------");
        mm.printGugudan(3);
        mm.printGugudan(5);
        System.out.println("-------------------------------");
        int randomValue2 = mm.getRandomValue(10,20); // 10 ~ 19
        System.out.println(randomValue2);
        randomValue2 = mm.getRandomValue(5,31); // 5 ~ 30
        System.out.println(randomValue2);


    }//main
}

class MyMethod {
    void checkOddEven(int n) {
//        String result = n % 2 == 0 ? "짝수입니다." : "홀수입니다.";
//        System.out.println(result);
        System.out.println((n % 2 == 0 ? "짝수입니다." : "홀수입니다."));
    }
    int abs(int r) {
        if (r > 0) {
            return r;
        }
        return (-r);
    }
    int getRandomValue(int n) {
        return (int)(Math.random() * n);
    }
    void printGugudan(int num) {
        for(int j =1; j <= 9; j++){
            System.out.printf("%d x %d = %d\n", num, j, num*j);
        }
    }
    int getRandomValue(int n1, int n2) {
        return (int)((Math.random() * (n2 - n1) + n1));
    }
} //class
