package com.green.day4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = 1;
        //(멈출)조건만 아는 경우 while
        do {
            System.out.print("숫자를 입력 해주세요. (종료:0) >> ");
            input = scan.nextInt();

        } while(input != 0);
        System.out.println("-- 종료 --");
    }
}
