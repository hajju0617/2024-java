package com.green.day9.ch4;
import java.util.*;
public class FlowEx27 {
    public static void main(String[] args) {

        int sum=0;

        while(true) {
            System.out.print("합계를 구할 숫자를 입력하세요. (종료:0) :");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            sum += num;

            if(num == 0) {
                break;
            }
            System.out.println("현재까지의 합은 " + sum + "입니다.");

        }

        System.out.printf("총합은 %d 입니다.\n", sum);

    }
}
