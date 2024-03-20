package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args) {
        char c = 'A';
        int finger = 10;
        // 리터럴 정수는 int타입
        // long타입 리터럴로 변경하려면 끝에 l,L 붙이면 된다.
        long big = 100_000_000_000L;

        System.out.printf("c = %c, %d\n", c, (int)c);
        System.out.printf("finger = [%5d]\n", finger); //5칸 할당해서 오른쪽으로 나열
        System.out.printf("ginger = [%-5d]\n", finger); //5칸 할당해서 왼쪽부터 나열
        System.out.printf("ginger = [%05d]\n", finger); //5칸 할당해서 오른쪽부터 나열, 빈칸은 0으로 채움
        System.out.printf("big = %d\n", big);

        int year = 2024, mon = 3, day = 20;
        System.out.printf("%04d-%02d-%02d\n", year,mon,day);

        String url = "www.green.com";
        float f1 = .10f; // = 0.10f와 동일
        // 리터럴 실수는 double타입이라 접미사 붙임 (끝에 f or F를 붙이면 float타입의 리터럴이 됨)
        double d = 1.23456789;

        System.out.printf("url = %s\n", url);
        System.out.printf("f1 = %f\n", f1);
        System.out.printf("d = %f\n", d);
        System.out.printf("d = %.2f\n", d); // 반올림 처리 됨
        System.out.printf("d = %10.2f\n", d); // 10자리 중 소수점 2번째 자리까지 반올림 처리 됨
        System.out.printf("d = %010.2f\n", d); // 10자리 중 소수점 2번째 자리까지 반올림 처리 됨(빈칸은 0으로)
        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%.8s]\n", url);
    }
}
