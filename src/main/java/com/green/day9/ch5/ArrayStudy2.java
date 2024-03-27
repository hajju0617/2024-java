package com.green.day9.ch5;

import java.util.*;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[100];
        for(int i = 0; i < 100; i++) {
            numArr[i] = i+1;
        }
        for(int i = 0; i < 100; i++) {
            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }

//        for(int i = 0; i < 100; i++) {
//            System.out.printf("numArr[%d] = %d\n", i, numArr[i] = (int)(Math.random() * 100.0)); (랜덤값 삽입)
//        }
        System.out.println(numArr.length);
        System.out.println(Arrays.toString(numArr));
    }   //main
}
