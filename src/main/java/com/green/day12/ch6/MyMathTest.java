package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath(); // MyMath 클래스에서 객체화
        myMath.add(10,20);
        myMath.add(100,200);

        myMath.minus(100,50);
        myMath.minus(1000,500);

        System.out.println(myMath.returnAdd(500,600)); //myMath.returnAdd(500,600); => (1100);


    }
}

class MyMath { // class 앞에 public 붙일 수 없음 -> 같은 패키지내에서만 가능
               // (public은 클래스 파일명과 class뒤에 적은 단어가 같아야 쓸 수 있다)
    //리턴타입(void) add(메소드명) 파라미터(=매개변수)(int n1, int n2) -> 메소드 선언부
    // 매개변수라고 불리는 이유 -> 호출할때마다 값이 다름
    // { } 내부 -> 메소드 구현부
    // 메소드의 종류는 4가지
    // 1. 파라미터,리턴값이 있는 경우, 2.파라미터만 있는 경우, 3.리턴값만 있는 경우, 4.둘 다 없는 경우
    // 메소드는 2가지로 분류 -> 리턴값이 있는 메소드, void 메소드(리턴값 x)
    void add(int n1, int n2) {      // static이 붙지 않은 애들은 사용하려면 객체화를 먼저 해야 된다
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    // 반환값 타입을 젤 앞에 적어준다 (현재는 "int" returnAdd)
    int returnAdd(int n1, int n2) {
        return n1 + n2;         // return n1 + n2 타입과 "int" returnAdd 의 타입은 같아야 한다)
    }
    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }
    void method1() { // 파라미터,리턴값 둘 다 없는 경우

    }

    int method2() { // 파라미터만 없는 경우
        return 10;
    }


}
