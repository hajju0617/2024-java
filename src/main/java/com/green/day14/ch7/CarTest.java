package com.green.day14.ch7;

public class CarTest {
    public static void main(String[] args) {

    }
}

class Car {
    int cc;
    int company;

    Speaker speaker; // (has-a관계)

    void drive() {
        System.out.println("자동차가 붕붕");
    }
}
class Avante extends Car {  // (is-a)관계

}

class Speaker {
    int volume;
    void play() {
        System.out.println("음악이 흘러나온다.");
    }
}