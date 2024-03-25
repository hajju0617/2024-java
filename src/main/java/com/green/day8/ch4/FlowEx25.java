package com.green.day8.ch4;
import java.util.*;
public class FlowEx25 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요. (ex. 12345) : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = 0;

        while(num != 0) {
            result += num%10;
            System.out.printf("result = %d\n", result);
            System.out.println(num);

            num /= 10;
        }


    }
}
