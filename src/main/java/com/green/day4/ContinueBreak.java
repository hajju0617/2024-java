package com.green.day4;

public class ContinueBreak {
    public static void main(String[] args) {
        // continue, break 둘 다 반복문 안에서 사용
        // continue = skip, break = stop

        for (int i = 0; i<10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------");

        for (int i = 0; i<10; i++) {
            if(i == 5) break;
            System.out.println(i);
        }

        System.out.println("---------------");

        for (int i = 0; i<10; i++) {
            if(i == 5) continue; // continue -> i = 5일때 하단의 코드는 실행x (결과값 5출력 x)
            System.out.println(i);
        }
    }

}
