package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();

        boolean r = bullDog instanceof Dog;         // 왼쪽에는 참조 변수, 오른쪽에는 클래스명
        System.out.println("r : " + r);             // 형변환이 가능하면 true, 불가능하면 false

        Animal ani = new Animal();
        System.out.println("ani instanceof Dog : " + (ani instanceof Dog));  // false -> Animal이 부모 Dog는 자식이라서.

        ani = new BullDog();
        System.out.println("ani instanceof Dog : " + (ani instanceof Dog));   // ani에 BullDog객체 주소값 넣음
    }
}
