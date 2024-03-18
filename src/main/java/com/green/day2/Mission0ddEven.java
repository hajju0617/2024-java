package com.green.day2;

public class Mission0ddEven {
    public static void main(String[] args) {

        for(int i=0; i<100; i++) {
            int num = (int) (Math.random() * 10) + 1; // 1~10

            // num 만약 5라면 콘솔에 출력이 "5는 홀수 입니다." "10이면 짝수입니다"


            // 클래스 = 설계도, 설계도 대로 만들면 객체가 됨
            // 클래스 = 속성과 메소드로 이루어져 있다
            // 파란 글씨 = 예약어
            // Math.random()은 double이다.
            // 정수 타입 = byte,short,int,long , 실수 타입 = float,double
            if ((num % 2 == 0)) {
                System.out.printf("%d는 짝수입니다.\n", num);
            }
            else {
                System.out.printf("%d는 홀수입니다.\n", num);
            }
        }

    }
}
