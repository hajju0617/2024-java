package com.green.day8.ch4;
import java.util.*;
public class FlowEx11 {
    public static void main(String[] args) {
        /*
        character.getNumericValue() 메소드는 유니코드 문자를 해당하는 숫자 값으로 반환합니다.
        유니코드 문자는 일반적으로 문자를 나타내는 코드 포인트로 표현됩니다.
        이 코드 포인트는 숫자 값으로 변환될 수 있으며,
        이 변환을 수행하는 것이 getNumericValue() 메소드의 역할입니다
        일부 문자는 숫자 값을 가지지 않을 수 있으며, 이 경우에는 NaN(Not a Number)을 반환합니다
        --> 옆자리 알려줌
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요.:");
        String tmp = scan.nextLine();
        char gender = tmp.charAt(7);
        String result;

        /*
        제어문 중 일부는 break 문을 사용할 수 없습니다.
        조건문(if문, else문, switch문) 사용 가능합니다.
        반복문(for문, while문, do-while문) 사용 가능합니다.

        하지만, 다음과 같은 제어문에서는 사용할 수 없습니다.
        함수 호출문
        객체 생성문
        변수 선언문
         */

        switch (gender) {
            case '1','3' -> {
                switch (gender) {
                    case '1' -> result = "이전에";
                    default -> result = "이후에";
                }
                System.out.printf("당신은 남자이고 2000년 %s 출생했습니다.\n", result);
            }
            case '2','4' -> {
                switch (gender) {
                    case '2' -> result = "이전에";
                    default -> result = "이후에";
                }
                System.out.printf("당신은 여자이고 2000년 %s 출생했습니다.\n", result);
            }
            default -> System.out.println("유효하지 않은 주민등록번호 입니다.");
        }

    }
}
