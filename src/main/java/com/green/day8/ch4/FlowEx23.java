package com.green.day8.ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;
        while(i != 0) {
            System.out.printf("%d - I can do it.\n", i--); //(<- i를 i--로 고쳐주면 코드 1줄 줄이기 가능)
            i--;

        }
    }
}
