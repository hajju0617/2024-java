package com.green.day13.ch6;

// class 타입의 객체지향 언어는 객체를 생성할 때 생성자를 호출해야 한다.
// 생성자의 특징 : 객체 생성 때만 사용, 생성 후에는 호출 불가
// 생성자 작성법 : 1. 이름이 클래스명과 같다, 2. 리턴타입 없음 (1,2번 둘 다 메소드와 구분되는 점)
// 생성자 사용 이유 : 1. 객체생성 하기 위해, 2. 생성과 동시에 멤버필드 초기화 하기위해
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1(); // new 다음에 오는 Data1()이 생성자
        // d1.Data1(); -> 생성후에는 호출 불가
        System.out.println("d1.value : " + d1.value);

        Data2 d2 = new Data2(10);
        System.out.println("d2.value : " + d2.value);
        Data2 d2_1 = new Data2();
        System.out.println("d2_1.value : " + d2_1.value); // 100출력되게

    }   //main
}

class Data1 {
    int value;

    public Data1() { // 파라미터가 없는 기본 생성자(만 컴파일러가 자동으로 추가해준다, 생성자가 하나도 없을 때만)
        System.out.println("Data1 생성자 호출!!");
    }
}

class Data2 {
    int value;  // int value = 100; 명시적 초기화
    public Data2() {    // 생성자를 이용한 초기화
        value = 100;
    }
    public Data2(int param) {
        value = param;
    }
}
