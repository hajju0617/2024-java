package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("주민등록번호를 입력 해주세요 :");
        String input = scan.nextLine();

        char charval = input.charAt(7); //charAt() 메소드는 문자열에서 특정 위치의 문자를 반환하는 메소드입니다.
//        System.out.println(charval);
        String gender = switch (charval) {
            case '1', '3' -> "남자";
            case '2', '4' -> "여자"; // 막힌 부분 case 숫자값
            default -> "잘못된 번호"; // 단순 1,3 / 2,4 가 아니라 '1','3'/'2','4'로 처리
                                    // int 타입 1이랑 char 타입 1이랑 값이 다름 -> ' ' 안 하면 오류 발생
        };
        System.out.println(charval);
        System.out.printf("해당 주민번호는 %s 입니다.\n", gender);



    }
}
