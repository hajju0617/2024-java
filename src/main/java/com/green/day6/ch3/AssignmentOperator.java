package com.green.day6.ch3;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x, y, z;
        // left value( 저장할 수 있는 공간 ex.변수,배열...)
        // right value ( 연산식, 변수, 리터럴)
        x = y = z =  3;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // 복합 대입 연산자
         int n = 1;
         n = n + 1;
         n = n + 2;
         n = n + 3;
         System.out.println("1 - n = " + n);

         int m = 1;
         m += 1;
         m += 2;
         m += 3;
         System.out.println("2 - m = " + m);

         int k1 = 10, k2 = 3;
         k1 %= k2;
         System.out.println("3 - k1 = " + k1);
    }
}
