package com.green.day2;

public class Conditional0perator {
    public static void main(String[] args) {
        // 삼항식(조건식) 식? true 일때 :  false일때
        String s = "짝";
        s = "홀";

        s = 9 % 2 == 0 ? "짝" : "홀";
        System.out.println(s);


    }
}
