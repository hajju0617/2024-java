package com.green.day13.ch6;

public class PrimitiveRefEx {
    public static void main(String[] args) {
        int num = 10;

        Numbox nb = new Numbox();
        nb.num = 10;

        changeNum(num);
        // (알 수 있는 정보) void, 같은 클래스 안에 존재, 파라미터 정수값 1개, static 메소드, 메소드명이 changeNum
        System.out.println("num : " + num);

        changeNum(nb);
        System.out.println("nb.num : " + nb.num);
    }   //main

    public static void changeNum(Numbox n) { // 매개변수 n과 nb는 동일하지 않다. nb의 주소값만 n으로 복사해줄 뿐
        // n = new Numbox();
        n.num = 100;
    }

    public static void changeNum(int n) {
        n = 100;
    }
}

class Numbox {
    int num;
}