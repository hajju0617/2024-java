package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        System.out.print("점수를 입력해주세요");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        char grade;
        if ((num < 0) || (num > 100)) {
            System.out.println("점수가 잘못 입력 되었습니다");
        } else {
            // char grade = 'D'를 여기서 초기화 해서 else 문장 하나를 줄일 수 있다.
            if (num >= 90) {
                grade = 'A';
            } else if (num >= 80) {
                grade = 'B';
            } else if (num >= 70) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.printf("당신의 학점은 %c 입니다.", grade);
        }
        //scan.close(); 닫아주는 코드
        /*
        Scanner 객체를 사용해서 입력을 받은 후에는 scan.close()호출해서 리소스를 해제해야 함
        시스템입력을 읽어오기 위해서 시스템 리소스를 사용하는데 scan.close()호출하지 않으면
        해당 리소스가 계속해서 사용되어 시스템 자원이 낭비가 된다
        그리고 보안상의 이유도 있다 프로그램에서 사용되기 전까진 메모리에 저장되어 있음
         */







    }
}
