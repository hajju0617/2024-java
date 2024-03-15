package com.green.day2;

public class Var2 {

    int globalnum; // 전역변수
    public static void main(String[] args) {
        int num = 10, num2 = 11, num3 = 0; // 지역변수 (항상 초기화)
        // 지역 변수 명과 전역 변수 명은 같아도 되지만 안 하는 게 나음

        num3 = num + num2;
        System.out.println(num3);

        num3 = num3 + 3;
        System.out.println(num3);

        num3++;
        System.out.println(num3);

    }
}
