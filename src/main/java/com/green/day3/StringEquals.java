package com.green.day3;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "안녕";
        String s2 = "안녕";
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Hello";
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s1));

        System.out.println("-----------------------");

        String so1 = new String("안녕");
        String so2 = new String("안녕");

//         자바에서 문자열 비교는 equals로
//         == 연산자와 equals()메소드의 가장 큰 차이점은
//         == 연산자는 비교하고자 하는 두개의 대상의 주소값을 비교하는데 반해
//         String클래스의 equals 메소드는 비교하고자 하는 두개의 대상의 값 자체를 비교한다는 것입니다.
//         기본 타입의 int형, char형등은 Call by Value 형태로
//         기본적으로 대상에 주소값을 가지지 않는 형태로 사용됩니다.
//         하지만 String은 일반적인 타입이 아니라 클래스입니다.
//         클래스는 기본적으로 Call by Reference형태로 생성 시 주소값이 부여됩니다.
//         그렇기에 String타입을 선언했을때는 같은 값을 부여하더라도 서로간의 주소값이 다릅니다.

        //상수는 메모리 위치(공간)이며, 메모리 값을 변경할 수 없다.
        //리터럴은 메모리 위치(공간) 안에 저장되는 값이다.
        // const a = 1; 에서 a는 상수(constant) 1은 리터럴(literal)
        System.out.println(so1);
        System.out.println(so2);
        System.out.println(so1 == so2);
        System.out.println(so1.equals(so2));
        System.out.println(so2.equals(so1));
    }
}
