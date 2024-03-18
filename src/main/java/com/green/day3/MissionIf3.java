package com.green.day3;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력 해주세요. (남/여) >> ");
        String gender = scan.nextLine();
        System.out.print("당신의 키를 입력 해주세요 >> ");
        int height = scan.nextInt();

        // 남자 평균키 175 여자 평균키 161
        // gender "남" 기준값이 175
        // gender "여" 기준값이 161
        // gender "남" or 여 아니면" 성별을 입력 해주세요. > 종료

        if ("남".equals(gender)) {
            if (height > 175) {
                System.out.println("당신은 남자이고 평균키보다 큽니다.");
            } else if (height < 175) {
                System.out.println("평균키보다 작습니다.");
            } else {
                System.out.println("평균키 입니다.");
            }

        }
        else if ("여".equals(gender)) {
            if (height > 161) {
                System.out.println("당신은 여자이고 평균키보다 큽니다.");
            } else if (height < 161) {
                System.out.println("평균키 이하 입니다.");
            } else {
                System.out.println("평균키 입니다.");
            }
        }
        else {
            System.out.println("성별을 다시 입력 해주세요");
        }

        // 좀 더 잘 짜여진 코드 (중복을 최소화)
        int standHeight = 161; //여자 평균키값

        if ("남".equals(gender)) {
            standHeight = 175;
            System.out.print("남자 ");
        } else if ("여".equals(gender)) {
            System.out.print("여자 ");
        }

        if (height > standHeight) {
            System.out.println("평균키보다 큽니다.");
        } else if (height < standHeight) {
            System.out.println("평균키보다 작습니다.");
        } else {
            System.out.println("평균키 입니다.");
        }

    }
}
