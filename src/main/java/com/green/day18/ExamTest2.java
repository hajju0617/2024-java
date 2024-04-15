package com.green.day18;
import java.util.*;


public class ExamTest2 {
    public static void main(String[] args) {
        Exam2.printGugudan(2,5);
        System.out.println("------구구단 출력-------");
        int sum = Exam2.getSumFromString("11111");
        System.out.println("sum : " + sum);
        System.out.println("------문자열을 숫자로 더하기------");
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));
        Exam2.inputRandomValue(arr);
        System.out.println(Arrays.toString(arr));

    }

}   //

class Exam2 {
    static void inputRandomValue(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int rVal = ((int)(Math.random() * 9) + 1);
            arr[i] = rVal;
            for(int j = 0; j < i; j++) {
                if(arr[j] == rVal) {
                    i--;    // 중복된 값을 뽑은 배열방의 값을 덮어 씌우기 위해서
                    break;
                }
            }
        }
    }
    static void printGugudan(int n1, int n2) {
        for(int i = 1; i <= 9; i++) {
            for(int j = n1; j <= n2; j++) {
                System.out.printf("%d x %d = %d\t", j, i, i*j);
            }
            System.out.println();
        }
    }
    static int getSumFromString(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }
    /*
    int sum = 0;
    int val = Integer.parseInt(str);
    do {
        int oneDigit = val % 10;
        sum += oneDigit;
        val /= 10;
    } while (val > 0);
    return sum;                     getSumFromString 이렇게도 가능
     */
}
