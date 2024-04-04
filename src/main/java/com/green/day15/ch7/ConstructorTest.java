package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args) {
        Lion lion = new Lion();         // lion 호출

    }
}

class Animal {
    int age;
    //    Animal() {              // 기본 생성자 (안 적을 시 컴파일러가 자동으로 넣어줌)
//        super();
//    }
    public Animal() {

    }
    public Animal(int age) {
        this.age = age;
    }
}

class Lion extends Animal {
    Lion() {            // Lion 생성자 정의 부분
        super();        // 부모 클래서 생성자 호출
    }
}

class Tiger extends Animal {
    String name;
    Tiger() {
        super(10);
    }

    Tiger(int age) {
        super(age);                        // super()을 생략하면 자동으로 넣어줌
    }

    Tiger(int age, String name) {
        super(age);
        this.name = name;
    }
}