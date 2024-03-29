package com.green.day12.ch6;

public class Variable {
    int iv; // 인스턴스 변수, 전역 변수 (Global Variable)
    static int cv;  // 클래스 변수, 스태틱 변수, 전역 변수 (Global Variable)

    void method() {
        int lv = 0; // 지역 변수 (Local Variable)
    }

    static void staticMethod() {
        int lv = 0; // 지역 변수 (Local Variable)
    }
}
