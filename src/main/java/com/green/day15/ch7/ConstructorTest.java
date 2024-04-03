package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args) {

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