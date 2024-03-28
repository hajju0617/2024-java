package com.green.day11.ch6;

public class Tv { // public 를 붙이면 전부 다 사용가능 , 없애면 똑같은 패키지 내에서만 사용가능
    // Tv 클래스가 갖고 있는 속성(멤버 변수)
    String color;
    boolean power;
    int channel;

    // 기능(메소드)
    void power() {
        power = !power; // toggle 처리
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}