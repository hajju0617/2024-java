package com.green.day10.ch5;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = { 10, 20, 30 };

        int tmp;
        tmp = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = tmp;

        for(int i = 0; i < numArr.length; i++) {
            System.out.printf("numArr[%d] = %d\n", i,numArr[i]);
        }

    }
}
