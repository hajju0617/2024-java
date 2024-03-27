package com.green.day10;
import java.util.*;
public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        int num = 10;
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = num++;         // num++ 보단 10+i 해주는 게 나음 (num 변수 선언할 필요도 없어짐)
        }
        for(int i = 0; i < numArr.length; i++) {
            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }
        System.out.println(Arrays.toString(numArr));

        int random = (int)(Math.random() * 10);
        int tmp = 0;
        for(int i = 0; i < numArr.length; i++) {
            tmp = numArr[i];
            numArr[i] = numArr[random];
            numArr[random] = tmp;
        }
        System.out.println(Arrays.toString(numArr));

        char[][] ch = {{'a', 'b', 'c'},
                {'d', 'e', 'f'}
        };


    }
}
