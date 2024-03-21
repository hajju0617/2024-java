package com.green.day6.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두 자리 정수를 하나 입력해주세요. >> ");
        String input = scan.nextLine(); //input에 문자열이 저장됨 (숫자를 적어도 문자열로 삽입)

        //"123" -->> 123으로 변환하고 싶음 (문자열을 정수로 바꾸고 싶다)
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력 내용 : " + input);

        System.out.println("num : " + num);
        System.out.println("num + 1 : " + (num + 1));
    }
}
