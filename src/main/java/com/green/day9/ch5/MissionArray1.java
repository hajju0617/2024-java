package com.green.day9.ch5;

public class MissionArray1 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30, 40};

        int i;
        for(i = 0; i < numArr.length; i++) {
            //System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
//            System.out.print(numArr[i]+",");
            System.out.printf("%d, ", numArr[i]);
        }
        System.out.println();

        // 마지막 수 뒤에는 ,가 안 찍히게
        int result = numArr.length - 1;
        for(i = 0; i < numArr.length; i++) {
            if(i < result) {   // ()안에 numArr.length - 1 넣으면 실행시마다 계산을 해야됨
                               //     for 문 밖에서 미리 계산 해놓고 실행 하면 효율적
                System.out.printf("%d, ", numArr[i]);
            } else {
                System.out.printf("%d", numArr[i]);
            }
        } // for 문
        System.out.println();

        //밑으로는 강사님 답안
        for(i = 0; i < numArr.length; i++) {
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.printf("%d", numArr[i]); // 숫자, 순서가 아니라 , 숫자 로 찍히는 코드
        }                                       // 따라서 마지막 숫자는 ,가 안 찍힘


        //Q2) for문 활용 오른쪽과 같이 출력  >> 10, 20, 30, 40, 50
        System.out.println("------------ Q2-1");
        for(i=0; i<numArr.length; i++) {
            if (i == numArr.length - 1) {
                System.out.print(numArr[i]);
                continue;
            }
            System.out.printf("%d, ", numArr[i]);
        }
    } // main
}
