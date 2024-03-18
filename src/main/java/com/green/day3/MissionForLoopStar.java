package com.green.day3;

public class MissionForLoopStar {
    public static void main(String[] args) {
        int star = 0;

        for (int i=0; i<100; i++) {
            // 3~10 랜덤값이 star변수에 대입
            star = (int) ((Math.random() * 8) + 3); //Math.random() = 0.000000~0.999999사이의 랜덤값
            System.out.println(star);
        }

        //만약 star = 5 *****
        //만약 star = 10 ************

        for(int j=0; j < star; j++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i=star; i>0; i--) {
            System.out.print("*");
        }

    }
}
