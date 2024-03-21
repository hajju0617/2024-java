package com.green.day6.ch3;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10, y = 8;
        System.out.printf("x / y = %d (몫) , x %% y = %d (나머지 값)\n", x / y, x % y);

        int x2 = 7;
        System.out.printf("x2 / y = %d (몫)\n", x2 / y);
        System.out.printf("x2 %% y = %d (나머지 값)\n", x2 % y);

        System.out.println(10 % 8);
        System.out.println(-10 % 8);
        System.out.println(10 % -8);
        System.out.println(-10 % -8); // 뒤쪽 부호는 의미x

    }
}
