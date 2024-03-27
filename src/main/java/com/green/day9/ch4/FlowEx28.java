package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        System.out.print("수를 입력하세요. :");
        int answer = (int)((Math.random() * 100) +1);

        Scanner scan = new Scanner(System.in);

        while(true) {
            int num = scan.nextInt();


            if(num > answer) {
                System.out.println("입력한 숫자보다 값이 작습니다");
            } else if(num < answer) {
                System.out.println("입력한 숫자보다 값이 큽니다");
            } else {
                System.out.println("정답");
                break;
            }
        }
    }
}
