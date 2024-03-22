package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력 해주세요 :");
        int input = scan.nextInt();

        if(input <0 || input > 100) {
            System.out.println("점수를 잘못 입력하셨습니다.");
        } else { char ch = switch(input / 10) {
            case 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'F';
        };
            System.out.printf("당신의 학점은 %c입니다\n", ch);
        }


    }
}
