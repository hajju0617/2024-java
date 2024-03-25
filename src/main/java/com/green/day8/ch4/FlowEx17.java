package com.green.day8.ch4;
import java.util.*;
public class FlowEx17 {
    public static void main(String[] args) {
        System.out.print("*을 출력할 라인의 수를 입력하세요 :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0; i<num; i++) {  // 0~num-1 (num수 만큼)
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
