package com.green.day6.ch3;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a +b); //int c = a + b; (byte 대신 int를 써주면 형변환 없이 가능) (a,b,c가 short인 경우도 마찬가지)
        System.out.println(c);

        int d = 1_000_000_000;
        System.out.println(d); //언더바 자동 삭제

        long e = 1_000_000 * 1_000_000; // int * int =>오버플로우 발생
        long f = 1_000_000 * 1_000_000L; // int * long => 앞에 값이 자동으로 Long변환

        System.out.println("e  = " + e);
        System.out.println("f  = " + f);

        double g = 10 / 3;
        System.out.println("g = " + g);

        double g2 = 10 / (double)3;
        System.out.println("g2 = " + g2);
    }
}
