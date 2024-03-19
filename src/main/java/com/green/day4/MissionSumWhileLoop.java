package com.green.day4;

import java.util.Scanner;

public class MissionSumWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,num,sum=0;

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            num = scan.nextInt();
            if(num == 0) {
                break;
            }
            sum = sum + num;
        }
//        System.out.print("숫자를 입력해주세요 : ");
//        num = scan.nextInt();
//        for(i=1; i<=num; i++) {
//            sum = sum + i;
//        }
//        System.out.print("입력하신 수까지의 총합은 " + sum + " 입니다.");
    }
}
