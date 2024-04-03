package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        //Parent p = new Parent(55);
        Child child = new Child();
        //child.attack();
        child.doubleAttack();
    }
}

class Parent {
    int age;

    Parent(int n) {
        this.age = n;
    }
    void attack() {
        System.out.println("부모가 적을 공격한다.");
    }
    public void defense() {
        System.out.println("부모가 적의 공격을 방어한다.");
    }

}
class Child extends Parent {
    int mzPower;

    public Child() {
        super(12);        //기본 생성자를 만들어주면 오류 해결 가능 or ()안에 정수값 넣어주기
    }


    @Override   // @ : Annotation
    void attack() {
        //super.attack();
        System.out.println("자식이 적을 공격한다");

    }
    public void doubleAttack() {
        this.defense();
        super.defense();
        System.out.println("-----------------------");
        this.attack();
        super.attack();
    }
}
