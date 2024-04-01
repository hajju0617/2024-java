package com.green.day13.ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
        System.out.println("--------------------------");
        CallStackTest.firstMethod(); // 이렇게도 호출 가능
    }
    public static void firstMethod() {
        System.out.println("call firstMethod");
        secondMethod();
    }
    public static void secondMethod() {
        System.out.println("call secondMethod");
    }
}

/*
Stack(스택) = LIFO (Last In First Out)
Heap(힙) = FIFO (First In First Out)
 */
