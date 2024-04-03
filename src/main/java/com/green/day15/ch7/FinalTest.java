package com.green.day15.ch7;

public class FinalTest {
    public static void main(String[] args) {
        Car c = new Car(2200);
        System.out.println(c.CC);
        //c.cc = 100; final cc = 10으로 상수 처리 해놔서 변경 불가능
        Car c2 = new Car(3000);
        System.out.println(c2.CC);

    }
}

class Car {
    final int CC;   // 생성자를 이용하면 Lazy 처리 가능함
    Car(int cc) {
        this.CC = cc;
    }
    Car() {
        CC = 100;
    }
    final void start() {                        // 메소드 앞에 final을 적으면 오버라이딩을 못한다.
        System.out.println("자동차 시동을 건다");
    }
}

final class Suv extends Car {       // final class 는 상속을 못한다.
    Suv() {
        super();
    }
}
//class Tucson extends Suv {      // 에러 뜨는 이유 -> Suv 클래스 앞에 final 이 있어서 -> (상속 금지)
//
//}