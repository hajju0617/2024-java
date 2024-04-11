package com.green.day6.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        /*
        자바에서 문자열 비교는 equals로
        기본 데이터 타입(예: int, double, char 등)의 경우, == 연산자는 값이 같은지 비교합니다.

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
        동등성 --> 지위, 권리, 권한,equals
        동일성 --> 같은 인물, 같다

        자바에서 == 연산자와 equals() 메소드는 둘 다 객체의 동등성을 비교하는 데 사용되지만, 비교하는 대상과 방식에 차이가 있습니다.

        == 연산자
        기본 데이터 타입(예: int, char 등)의 값이 같은지 비교할 때 사용합니다.
        참조 데이터 타입(예: 객체)의 경우, 두 객체의 참조(메모리 주소)가 같은지
        즉 두 객체가 메모리 상에서 동일한 위치를 가리키고 있는지를 비교합니다.
        따라서, 두 객체가 내용적으로 같더라도 서로 다른 메모리 주소에 위치해 있다면, == 연산자는 false를 반환합니다.
        equals() 메소드
        Object 클래스에서 상속받은 메소드로, 객체의 내용 자체가 같은지를 비교합니다.
        Object 클래스의 기본 구현은 객체의 참조를 비교하는 == 연산자와 동일하게 작동합니다
        그러나 대부분의 클래스(특히 컬렉션 클래스들, String 클래스 등)에서는 이 메소드를 오버라이드(재정의)하여
        객체의 실제 내용이 같은지를 검사하도록 구현합니다.
        예를 들어, String 클래스에서 equals() 메소드는 두 문자열 객체의 내용이 같은지를 비교합니다.
        예시
        java


        String str1 = new String("java");
        String str2 = new String("java");

        System.out.println(str1 == str2); // false, 두 객체의 참조(메모리 주소)가 다르기 때문
        System.out.println(str1.equals(str2)); // true, 두 문자열의 내용이 같기 때문
        위 예시에서 str1과 str2는 내용은 같지만
        서로 다른 객체이므로 다른 메모리 주소를 가집니다
        따라서 == 연산자는 두 객체의 참조가 다르기 때문에 false를 반환하고
        equals() 메소드는 두 객체의 내용이 같기 때문에 true를 반환합니다.

        요약하자면, ==는 참조의 동등성(주소 값 비교)을 검사하고
        equals()는 객체의 내용적 동등성을 검사합니다
        따라서 객체의 내용 비교를 원할 때는 equals() 메소드를 사용해야 합니다.
         */
    }
}
