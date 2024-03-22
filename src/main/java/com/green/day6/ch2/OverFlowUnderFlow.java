package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = 127;

        int i2 = -129;

        int n3 = -129; // n3를 byte로 형변환을 할 것이다.
        // 형변환 할 수 있는 값인지 체크하는 if문작성

        if(Byte.MAX_VALUE >= n3) { //127~-128
            byte a = (byte)n3;
            System.out.println("a =  " + a);
        } else if (Byte.MIN_VALUE <= n3) {
            byte a2 = (byte)n3;
            System.out.println("a2 = " + a2);
        } else {
            System.out.println("변환할 수 없습니다.");
        }

        if(Byte.MAX_VALUE >= i) {
            byte b = (byte)i;
            System.out.println("b: " + b);
        }
        if(Byte.MIN_VALUE <= i2) {
            byte b2 = (byte)i2;
            System.out.println("b2 : " + b2);
        }
    }

}
