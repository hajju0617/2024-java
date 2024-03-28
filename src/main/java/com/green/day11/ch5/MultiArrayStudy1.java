package com.green.day11.ch5;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[3][5];

        score[0][0] = 5;
        score[1][1] = 10;
        score[1][3] = 50;

        System.out.println("score.length : " + score.length);
        System.out.println("score.length : " + score[0].length);

        int[] temp = score[0];


        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[0].length; j++) {
                System.out.printf("%d\t", score[i][j]);
            }
            System.out.println();
        }

    }
}
