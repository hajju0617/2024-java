package com.green.day10;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100, 100, 90 };

        int i, sum = 0;
        double avg = 0.0;

        for(i = 0; i < score.length; i++) {
            sum += score[i];
        }
        for(i = 0; i < score.length; i++) {
            avg = sum / (double)score.length;
        }
        System.out.printf("학생들의 국어 점수의 총점은 %d, 평균은 %.2f 입니다.\n", sum, avg);
    }
}
