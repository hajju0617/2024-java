package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {           //int[4][3]
                { 100, 90, 80 }, // 00 ~ 02       00 01 02
                { 20, 25, 35 },    // 10 ~ 12       10 11 12
                { 30, 30, 30 },    // 20 ~ 22       20 21 22
                { 40, 40, 40 }     // 30 ~ 32       30 31 32
        };

        int val1 = 0,val2 = 0,val3 =0;
        for(int i = 0; i < score.length; i++) {
            val1 += score[i][0];
            val2 += score[i][1];
            val3 += score[i][2];
        }
        double avg11 = val1 / (double)score.length;
        double avg22 = val2 / (double)score.length;
        double avg33 = val3 / (double)score.length;
        System.out.printf("val1 = %d, avg11 = %.2f\n", val1,avg11);
        System.out.printf("val2 = %d, avg22 = %.2f\n", val2,avg22);
        System.out.printf("val3 = %d, avg33 = %.2f\n", val3,avg33);



        System.out.println("-----------------------------");



        int[] sumArr = new int[score[0].length];
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                sumArr[j] += score[i][j];
            }
        }
        for(int i = 0; i < sumArr.length; i++) {
            System.out.printf("%d칸의 합계값 : %d, 평균값 : %.2f\n", i, sumArr[i], (double)sumArr[i] / score.length);
        }
    } //main
}
