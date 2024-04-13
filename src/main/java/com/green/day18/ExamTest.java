package com.green.day18;

import com.green.day3.P;



public class ExamTest {
    public static void main(String[] args) {
        int rval = Exam.getRandomValue(1,101); // 1~10 랜덤값 리턴
        int rval2 = Exam.getRandomValue(1,101);
        System.out.println(rval);
        rval = Exam.getRandomValue(5,21); // 5~20 랜덤값 리턴
        System.out.println(rval);
        System.out.println("----------");

        rval = Exam.getRandomValue(1,101);
        Exam.printOddEven(rval);
        System.out.println("------");           //
        for(int i = 100; i < 104; i++) {
            System.out.println(200 - i);
        }
        System.out.println("----ㅇㅇ----");

        Exam.test(rval, 10);
        System.out.println("-----");
        Exam.printNumToNum(4,22);
        System.out.println("--------");

        int score = Exam.getRandomValue(-100, 200);
        System.out.println("score : " + score);
        String grade = Exam.getGrade(score);
        System.out.println(grade);
        System.out.println("--------");

        int sum = Exam.getSumFromTo(8,20);
        System.out.println("sum : " + sum);

    }
}

class Exam {
    static int getRandomValue(int n1, int n2) {
        int rval = (int) ((Math.random() * (n2 - n1)) + n1);
        return rval;
    }
    static void printOddEven(int n1){
        if(n1 % 2 == 0) {
            System.out.printf("%d는 짝수입니다.", n1);
            return;
        }
        System.out.printf("%d는 홀수입니다.", n1);
    }
    static void test(int n1, int n2) {
        if (n1 % 2 == 0) {
            System.out.println(n2 % 2 == 0 ? n2 - n1 : n1);
            return;
        }
            System.out.println(n2 % 2 == 0 ? n2 - 5 : n1);
    }
    static void printNumToNum(int n1, int n2) {
        for(int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
    static String getGrade(int n1) {
        if (n1 < 0 || n1 > 100) {
            return "점수가 잘못 되었습니다";
        } else {
            String grade = switch(n1 / 10) {
                case 10,9 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                default -> "F";
            };
            char ch = switch(n1 % 10) {
                case 7,8,9 -> '+';
                case 3,4,5,6 -> '0';
                default -> '-';
            };
            return String.format("%s%c", grade, ch);
        }
    }
    static int getSumFromTo(int n1, int n2) {
        int sum = 0;
        for(int i = n1; i <= n2; i++) {
            sum += i;
        }
        return sum;
    }
}
