package com.green.day4;

import java.sql.SQLOutput;

public class MissionGrade {
    public static void main(String[] args) {
        //int score = 0~100점 사이의 랜덤값 나올 수 있도록

        int score = (int)(Math.random() * 101);
        System.out.println(score);

        System.out.print("당신의 학점은 ");
        if(score >= 90) {
            System.out.print("A");
        } else if (score >= 80) {
            System.out.print("B");
        } else if (score >= 70) {
            System.out.print("C");
        } else {
            System.out.print("F");
        }
        System.out.println("입니다.");

        /*
        if(score > 100 || score < 0) {
        System.out.println("score 점수가 잘못 되었습니다.");
        } else {
            String grade = "F";
            if(score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            }
            System.out.printf("당신의 학점은 %s입니다.\n", grade);
        }
        */
    }
}
