package com.green.day8.ch4;

import java.sql.SQLOutput;

public class FlowEx19 {
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++) {
            for(int j = 1; j<=3; j++) {
                for(int k =1; k<=3; k++) {
                    System.out.printf("%d%d%d\n", i,j,k);
                }
            }
        }
        System.out.println();

        /* 강사님 코드
        final int LAST_NUM = 4;
        for(int i = 1; i<=LAST_NUM; i++) {
            for(int j = 1; j<=LAST_NUM; j++) {
                for(int k =1; k<=LAST_NUM; k++) {
                    System.out.printf("%d%d%d\n", i,j,k);
                }
            }
        }
         */
    }
}
