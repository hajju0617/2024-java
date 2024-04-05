package com.green.day17.ch11;
import java.util.*;
public class ArrayListStudy2 {
    public static void main(String[] args) {
        int n1 = 10;        // primitive 타입
        Integer n2 = 10;    // primitive 타입의 객체형
        System.out.println(n1 == n2);
        double d1 = 10.1;
        double d2 = 10.1;

        List<Integer> list = new ArrayList(); // ArrayList 뒤에 <Integer>를 적는 걸 제네릭 기법이라 함
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0);
        int r = list.get(0);
        int r2 = list.get(1);

        System.out.println(list);

        for(int i = 0; i < list.size(); i++) {    //list ".size()" 메소드를 이용
            System.out.printf("list.get(%d) -> %d\n", i, list.get(i));
        }
    }
}
