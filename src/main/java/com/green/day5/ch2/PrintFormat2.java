package com.green.day5.ch2;

public class PrintFormat2 {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 22;
        double height = 178.2;
        char bloodType = 'A';
        boolean isSingle = true;

        System.out.printf("저의 이름은 %s입니다. 나이는 %s살, 키는 %scm, 혈액형은 %s형,\n", name,age,height,bloodType);
    }
}
