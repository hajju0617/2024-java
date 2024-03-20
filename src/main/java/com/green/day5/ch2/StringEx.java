package com.green.day5.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        System.out.println(name);

        String str = name + 8.0;
//        연산 과정
//        String str = "Java" + 8.0;
//        String str = "Java" + "8.0";
//        String str = "Java8.0";
        System.out.println(str);

        System.out.println(7 + "" + 7);
        //연산 과정
//        System.out.println("7" + "" + 7);
//        System.out.println("7" + 7);
//        System.out.println("7" + "7");
//        System.out.println("77");
        System.out.println(7 + 7 + "" + 7);
        //연산 과정
//        System.out.println(7 + 7 + "" + 7);
//        System.out.println(14 + "" + 7);
//        System.out.println("14" + 7);
//        System.out.println("147");
        System.out.println(7 + "" + 7 + 7);
        //연산과정
//        System.out.println(7 + "" + 7 + 7);
//        System.out.println("7" + 7 + 7);
//        System.out.println("77" + 7);
//        System.out.println("777");




    }
}
