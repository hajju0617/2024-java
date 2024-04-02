package com.green.day13.ch6;
import java.util.*;

public class MyArrays {         //파일명과 똑같은 거 앞에만 public 붙일 수 있다.
    static void printArr(int[] arr2) {
        if (arr2.length == 0) {      //예외 처리
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", arr2[0]);
        for(int i = 1; i < arr2.length; i++) {
            System.out.printf(", %d", arr2[i]);
        }
        System.out.print("]");
    }
    static String toString(int[] arr3) {    //메소드 구성요소 3가지 : 리턴타입, 메소드명, 파라미터
        if(arr3.length == 0) {
            return "[]";
        }
//        String tmp = "[" + arr3[0];
        String tmp = String.format("[%d", arr3[0]);
        for(int i = 1; i < arr3.length; i++) {
            tmp += String.format(", %d", arr3[i]);
        }
        tmp += "]";
        return tmp;
    }
}

class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4, 10 };
        MyArrays.printArr(arr);

        System.out.println();

        String str = Arrays.toString(arr);
        System.out.println("str : " + str);

        String str2 = MyArrays.toString(arr);
        System.out.println("str2 : " + str2);
    }
}
