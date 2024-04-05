package com.green.day17.ch7;

public class AnnonymousTest2 {
    public static void main(String[] args) {
        Movable m1 = new MyMove();
        m1.move();

        Movable m2 = new Movable() {        // 익명 클래스
            @Override
            public void move() {
                System.out.println("일본으로 가자!!");
            }
        };
        m2.move();
    }   // main
}
interface Movable {     // 인터페이스를 객체화 하는 건 불가능 but 익명 클래스는 가능
    void move();
}

class MyMove implements Movable {
    @Override
    public void move() {
        System.out.println("서울까지 가자~~~");
    }
}
