package com.green.day14.ch6;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("white", "auto", 5);
        System.out.printf("c1.color : %s, c1.gearType : %s, c1.door : %d\n", c1.color, c1.gearType, c1.door);


        Car c2 = new Car("black", "manual", 3);
        System.out.printf("c2.color : %s, c2.gearType : %s, c2.door : %d\n", c2.color, c2.gearType, c2.door);

        Car c3 = new Car();
        System.out.printf("c3.color : %s, c3.gearType : %s, c3.door : %d\n", c3.color, c3.gearType, c3.door); // red, manual, 5

        Car c4 = new Car(c2);
        System.out.printf("c4.color : %s, c4.gearType : %s, c4.door : %d\n", c4.color, c4.gearType, c4.door);

    }   //main
}

class Car {
    String color;
    String gearType;
    int door;

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    Car() {
//            color = "red";
//            gearType = "manual";
//            door = 5;
        this("red", "manual", 5);
    }
    public Car(Car c) {
//        color = c.color;
//        gearType = c.gearType;
//        door = c.door;
        this(c.color, c.gearType, c.door);

    }
        // this = 나 자신의 주소값을 가지고 있는 상수
        // (6행 c1과 this 는 같은 주소값,c1.color에서 color는 String 뒤에있는 color를 지칭)
}
