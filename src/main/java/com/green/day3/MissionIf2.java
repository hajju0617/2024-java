package com.green.day3;

import java.util.Scanner;

public class MissionIf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 키를 입력 해주세요 >> ");
        int height = scan.nextInt();
        System.out.println("키" + height + 10 + "cm");
        // +는 사칙연산도 가능하지만 문자열 합칠때도 사용 가능 (단 언어마다 다름)
        // height는 int타입이고 cm는 문자열 --->>> 서로 합치면 문자열로 바뀐다.
        // height + 10 + "cm" = 숫자cm가 되지만 "키" + height + 10 + "cm"하면 키height10cm가 됨
        // 해결방법 우선순위를 높혀주면 된다 -->> "키" + (height + 10) + "cm"

        // 161 초과 = "당신은 평균보다 큽니다." 161 미만 = "당신은 평균보다 작습니다."
        // 161 = "당신은 평균입니다"

        if (height > 161) {
            System.out.println("당신은 평균보다 큽니다.");
        }
        else if (height < 161) {
            System.out.println("당신은 평균보다 작습니다.");
        }
        else {
            System.out.println("당신은 평균입니다.");
        }
    }
}
