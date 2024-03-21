package com.green.day6.ch3;

public class OperatorEx1 {
    public static void main(String[] args) {
        int n1 = 3, n2 = 5;

        int r1 = -n1 - n2;
        System.out.println("r1 = " + r1);

        int r2 = n1 + n2 * n1 / n2;
        System.out.println("r2 = " + r2);

        System.out.println("----------------------------------");
        // 증감 연산자
        int i = 5, z =0;
        i++;
        System.out.println("i = " + i);

        i = 5;
        ++i;
        System.out.println("i = " + i);

        i = 5;
        z = i++; // read -> write
        System.out.printf("i : %d, z : %d\n", i,z);

        i=5;
        z=0;
        z = ++i; // write -> read
        System.out.printf("i : %d, z : %d\n", i,z);

        System.out.println("-----------------------");

        int k = 10;
        System.out.println(k++);
        System.out.println(++k);
        System.out.println(++k);
        System.out.println(k++);
        System.out.println(k);
        // 10 12 13 13 14
    }
}
