package com.green.day13.ch6;
import java.util.*;
public class ReferenceParamEx {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4, 10 };
        System.out.println(Arrays.toString(arr));

        printIntArr(arr); // 위에 int[] arr 과 똑같은 배열 출력 하기

    }   // main

    static void printIntArr(int[] Arr) {    // arr의 주소값을 복사받음
        System.out.println(Arrays.toString(Arr));

          // 위 처럼 메소드 기능을 쓰는 것 보단 생각.
//        강사님 코드
//        if(Arr.length == 0) {
//            System.out.println("[]");
//            return;
//        }
//        System.out.printf("[%d", Arr[0]);
//        for(int i = 1; i < Arr.length; i++) {
//            System.out.printf(", %d", Arr[i]);
//        }
//        System.out.println("]");
    }
}
