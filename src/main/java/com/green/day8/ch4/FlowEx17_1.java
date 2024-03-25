package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args) {
        System.out.print("*을 출력할 라인의 수를 입력하세요 :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0; i<num; i++) {
            for(int k = 1; k<num - i; k++) {
                    System.out.print("_");
                }
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        강사님
//        for (int a=num; a>0; a--) {
//            for(int b = 1; b<= num; b++) {
//                System.out.print(b<a ? "_" : "*");
//            }
//            System.out.println();
//        }
    }
}
