package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            System.out.println("----시작----");
            int a = 10;
            int b = 20;
            //int c = 10 / 0;
            throw new Exception();      // 일부러 예외를 발생시킴
        } catch (ArithmeticException e) {
            System.out.println("수학적 예외 발생!!!");
        }
        catch(Exception e) {
            e.printStackTrace();    // 예외가 발생한 이유를 알려줌
            System.out.println("예외 발생!!");
        } finally {             // finally : 옵션 (항상 반드시 실행한다 (예외가 발생하던 안 하던))
            System.out.println("finally");
        }
        System.out.println("----종료----");
    }
}
