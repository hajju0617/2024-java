package com.green.day5.ch2;

public class PrintFormat2 {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 22;
        double height = 178.2;
        char bloodType = 'A';
        boolean isSingle = true;

        System.out.printf("저의 이름은 %s입니다. 나이는 %s살, 키는 %scm, 혈액형은 %s형, %s\n",
                name,age,height,bloodType, isSingle ? "싱글입니다." : "싱글이 아닙니다.");
        // 모든 값들은 %s로 할 수 있으나 해당 변수타입의 기능은 쓸 수 없다
    }
}
