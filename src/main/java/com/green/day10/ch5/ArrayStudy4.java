package com.green.day10.ch5;
import java.util.*;
public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] nArr1 = { 10, 20, 30, 40 };
        int[] nArr2 = new int[nArr1.length]; // 숫자 3 대신 nArr1.length 를 써서 유지보수 용이

        System.out.println(Arrays.toString(nArr1));

        for(int i = 0; i < nArr2.length; i++) {
            nArr2[i] = nArr1[i];
        }
        System.out.println(Arrays.toString(nArr2));

        for(int i = 0; i < nArr2.length; i++) {
            nArr2[i] = nArr1[i] + 5;
        }
        System.out.println(Arrays.toString(nArr2));
    }
}
