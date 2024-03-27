package com.green.day10;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95, 200, 11};

        int max = score[0];
        int min = score[0];

        for(int i = 0; i < score.length; i++) { // 초기값으로 score[0]을 min,max 로 지정 했으니까
                                                // i = 0보단 i = 1부터 시작하는 게 효율적
            if(score[i] > max) {
                max = score[i];
            }
            if(min > score[i]) {
                min = score[i];
            }
        }
        System.out.printf("최댓값 = %d, 최솟값 = %d\n", max, min);
    }
}
