package com.green.day4;

import java.util.Scanner;

public class p {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int i,sum=0;
//        System.out.print("숫자를 입력해주세요 : ");
//        int num = scan.nextInt();
//
//        for(i=1; i<=num; i++) {
//            sum = sum + i;
//        }
//        System.out.print("1부터 입력하신 수까지의 합은 " + sum + " 입니다");
//
//        System.out.println();

        for (int a = 1; a <= 3; a++) {
            int b;
            for (b = 1; b < 4 - a; b++) {
                System.out.print(" ");
            }
            for (b = 1; b <= (a * 2) - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = 1; a <= 2; a++) {
            int b;
            for (b = 1; b <a+1; b++) {
                System.out.print(" ");
            }
            for (b = 1; b <= 5 - (2 * a); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
