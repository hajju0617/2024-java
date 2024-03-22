package com.green.day5;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (남/여) >> ");
        String gender = scan.nextLine();


        //참조변수에만 null 삽입 가능 (해당 코드의 의미 : 주소값을 가지고 있지 않다. -->> 이것은 객체를 가리키고 있지x))
        //객체의 주소값만 저장 가능(그리고 이것은 객체를 가리키고 있다고 표현)

        //jdk12버전부터 새로 추가된 문법 (switch expression)
        //switch expression 문법 (break;를 따로 안 써도 됨 -> why? 표현식 이기 때문
        String result = switch (gender) {
            case "여", "여자" -> "당신은 여성입니다.";
            case "남", "남자" -> "당신은 남성입니다.";
            default -> "성별을 다시 입력해 주세요";

        };
        System.out.println(result);
    }
}
