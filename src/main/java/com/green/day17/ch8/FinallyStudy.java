package com.green.day17.ch8;

public class FinallyStudy {
    public static void main(String[] args) {
        method(2);
    }   //main
    public static void method(int val) {
        try {
            if(val % 2 == 0) {
                return;
            }
        } catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("finally");      // 어떤 상황에서도 항상 실행된다 (return 을 만나더라도)
        }
        System.out.println("method 종료");
    }
}
