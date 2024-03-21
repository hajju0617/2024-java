package com.green.day6.ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        // 문자열 = 문자배열 ({'h', 'e', 'l', 'l', 'o'})
//        String str = "abcdefg";
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));
//        System.out.println(str.charAt(4));
//        System.out.println(str.charAt(5));
//        System.out.println(str.charAt(6));

        Scanner scan = new Scanner(System.in);
        char ch = ' ';
        System.out.println("문자를 하나 입력 하세요 >> ");
        String input = scan.nextLine();
        ch = input.charAt(0);
        if('0' <= ch && ch <= '9') { // ch에 들어간 문자가 0~9사이 인지 (아스키 코드 값 48~57)
            System.out.println("입력하신 문자는 숫자입니다.");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println("입력하신 문자는 소문자입니다.");
        } else if ('A' <= ch && ch <= 'Z') {
            System.out.println("입력하신 문자는 대문자입니다.");
        }
        System.out.println("-- 끝 --");

    }
}
