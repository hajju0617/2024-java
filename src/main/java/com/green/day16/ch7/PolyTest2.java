package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        // 리턴타입 void, 파마미터 1개씩 받는다. static, 메소드 위치는 polyTest2, 메소드명 doCrying
        doCrying(dog);
        doCrying(bullDog);
        doCrying(cat);

        doSleep(dog);
        doSleep(bullDog);
    }
    public static void doCrying(Animal ani) {
        ani.crying();
    }

    public static void doSleep(Animal ani2) {
        if(ani2 instanceof Dog) {
            Dog dog = (Dog)ani2;
            dog.sleep();
        }
//        if(ani2 instanceof Dog dog) {       // enhanced instanceof 문법
//            dog.sleep();
//        }
    }


//    public static void doSleep(Dog dog) {
//        dog = new BullDog();
//        ((BullDog) dog).sleep();
//        dog.sleep();
//    }

}


