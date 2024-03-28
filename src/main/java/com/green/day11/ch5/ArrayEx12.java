package com.green.day11.ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" }; // string 객체의 주소값만 담을 수 있는 공간3개
        System.out.println(names[1]);

        String tmp = names[1];
        System.out.println("tmp : " + tmp);

        names[0] = "Yu";
        System.out.println("names[0] = " + names[0]);

        // 일반 for문
        for(int i = 0; i < names.length; i++) {
            String val = names[i];
            System.out.printf("val = %s\n", val);
        }
        System.out.println("---------------------------------");
        // 향상된 for 문 (for each 문)
        for(String val : names) {
            System.out.printf("val = %s\n", val);
        }
    }
}
