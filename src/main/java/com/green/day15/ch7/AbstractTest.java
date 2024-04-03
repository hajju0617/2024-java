package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args) {
        Dog d = new Dog();
    }   //main
}

abstract class Dog {        // abstract class -> 추상 클래스 : 객체화 할 수 없음

}

abstract class Cat {
    abstract void crying(); // 추상 메소드(앞에 꼭 abstract를 붙여줘야 함) ( 선언부만 있고 구현부는 없음)
                            // 단 하나의 추상 메소드만 있어도 클래스는 추상 클래스로 만들어줘야함
}

class KoreaShort extends Cat {      // 추상 클래스를 상속 받을 시 추상 메소드를 강제로 사용
    void crying() {
        System.out.println("야옹~ 야옹~");
    }
}
class AmericaCat extends Cat {
    @Override
    void crying() {
        System.out.println("미유~~ 미유~~");
    }
}
