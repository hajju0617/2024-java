package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String input = scan.nextLine();

        int num = Integer.parseInt(input);
        System.out.printf(num == 0 ? "입력하신 숫자는 0입니다." : "입력하신 숫자는 0이 아닙니다. 입력하신 숫자는 %d 입니다.", num);

        /*
        String result = switch (num) {
            case 0 -> "입력하신 숫자는 0입니다.";
            default -> String.format("입력하신 숫자는 0이 아닙니다. " + "입력하신 숫자는 %d 입니다.", num);
        };
        System.out.print(result);
        선생님 답안
         */

//        if문 사용
//        if (num == 0) {
//            System.out.println("입력하신 숫자는 0 입니다.");
//        } else {
//            System.out.printf("입력하신 숫자는 0이 아닙니다. 입력하신 숫자는 %d입니다.", num);
//        }






    }
}
