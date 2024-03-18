package com.green.day2;

public class Randomvalue {
    public static void main(String[] args) {
        // 형변환 (타입이 맞지 않으면 타입 변환을 해야 한다)
        // 자동형변환, 강제형변환
        System.out.println(Math.random() * 10); // 범위 0.000000~0.999999

        System.out.println("---------------------");

        // 강제형변환
        int result = (int) (Math.random() * 10); // 범위 0~9
        System.out.println(result);
    }
}
