package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요");
        String input = scan.nextLine();
        int score = Integer.parseInt(input);

        char symbol = switch (score % 10){
            case 0, 1, 2 -> '-';
            case 3, 4, 5, 6 -> '0';
            default -> '+'; // 막힌 부분 case7,8,9->'+'로 했는데 마지막을 default 로 수정해서 해결
        };
        char grade=' ';
        if ((score) < 0 || (score >100)) {
            System.out.println("점수를 잘못 입력했습니다.");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80){
                grade = 'B';
            }
            else {
                grade = 'C';
                symbol = '0';
            }
        }

        System.out.printf("당신의 학점은 %c%c입니다.", grade,symbol);

    }
}
