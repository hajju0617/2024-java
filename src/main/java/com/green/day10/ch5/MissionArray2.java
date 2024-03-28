package com.green.day10.ch5;

public class MissionArray2 {
    public static void main(String[] args) {
        int[] score = new int[10];


        for(int i = 0; i < score.length; i++) {
            System.out.printf("score[%d] = %d\n", i,score[i] = (int)(Math.random() * 21.0) + 10);
        }
    }
}
