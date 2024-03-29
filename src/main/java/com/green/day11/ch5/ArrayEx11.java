package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];

        // numArr 모든 방에 0~9사이의 랜덤값 삽입
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10); // 0 <= random < 1
        }
        System.out.println(Arrays.toString(numArr));

        System.out.println("---------------------------------");

        int i;
        for(i = 0; i < numArr.length; i++) {
            counterArr[numArr[i]]++;    // numArr[0] = 0이라면 counterArr[0]++ -> counterArr[0] = 1
                                        // numArr[1] = 1이라면 counterArr[1]++ -> counterArr[1] = 1
                                        // numArr[2] = 1 ''       ''          -> counterArr[1] = 1++ -> 2
                                        // numArr[3] = 5 ''       ''          -> counterArr[5] = 1
            System.out.printf("counterArr[%d] : %d\n", i, counterArr[i]);
        }
        System.out.println(Arrays.toString(counterArr));

        System.out.println("---------------------------------");
        for(i = 0; i < numArr.length; i++) {
            int num = numArr[i];
            counterArr[num] = counterArr[num]++; // 한줄로 줄이면 counterArr[num]++;
            System.out.printf("counterArr[%d] : %d\n", i, counterArr[i]);
        }
        System.out.println(Arrays.toString(counterArr));


    }
}
