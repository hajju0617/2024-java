package com.green.day5;

public class MissionGradeV2 {
    public static void main(String[] args) {
            int score = ((int) (Math.random() * 121) - 10);
            System.out.println("입력된 점수는 " + score + "입니다");

            //switch expression 문법 (break;를 따로 안 써도 됨 -> why? 표현식 이기 때문
            // int,char,string,enum 가능
            // double은 직접 지원x (람다,메소드 사용해야 가능)
        if ((score > 100) || (score < 0)) {
            System.out.println("점수가 잘못되었습니다.");
        } else {
            int val1 = score / 10;
            int val2 = score % 10;
            char grade;
            char sign;

            grade = switch (val1) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                default -> 'F';
            };
            sign = switch (val2) {
                case 0, 1, 2 -> '-';
                case 3, 4, 5, 6 -> '0';
                default -> '+';
            };
            /*
            char grade = (score / 10 >= 8) ? 'A' : (score / 10 >= 7) ? 'B' : 'C';
            char a = (score % 10 < 3) ? '-' : (score % 10 < 7) ? '0' : '+';
            좀 더 간결한 코드
             */
            System.out.println("당신의 점수는 " + grade + sign + "입니다");
        }



    }
}
