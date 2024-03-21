package com.green.day6.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        /*
        자바에서 문자열 비교는 equals로
        == 연산자와 equals()메소드의 가장 큰 차이점은
        == 연산자는 비교하고자 하는 두개의 대상의 주소값을 비교하는데 반해
        String클래스의 equals 메소드는 비교하고자 하는 두개의 대상의 값 자체를 비교한다는 것입니다.
        기본 타입의 int형, char형등은 Call by Value 형태로
        기본적으로 대상에 주소값을 가지지 않는 형태로 사용됩니다.
        하지만 String은 일반적인 타입이 아니라 클래스입니다.
        클래스는 기본적으로 Call by Reference형태로 생성 시 주소값이 부여됩니다.
        그렇기에 String타입을 선언했을때는 같은 값을 부여하더라도 서로간의 주소값이 다릅니다.
        *
         */

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str1 == str2 => " + (str1 == str2));
        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        /*
        동등성 --> 지위, 권리, 권한
        동일성 --> 같은 인물, 같다
         */
    }
}
