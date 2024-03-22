package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 해주세요 : ");
        String input = scan.nextLine();
        int month = Integer.parseInt(input);

        if((month < 1) || (month >12)) {
            System.out.println("잘못 입력 하셨습니다");
        } else {
            String season = switch (month) {
                case 3, 4, 5 -> "봄";
                case 6, 7, 8 -> "여름";
                case 9, 10, 11 -> "가을";
                default -> "겨울";
            };
            System.out.printf("현재의 계절은 %s 입니다.\n", season);
        }

    }
}
