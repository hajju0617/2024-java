package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) { //i값이 1000이면 제대로 된 출력x 유연하지 못한 코드
            System.out.print("i = " + i);
                if ((i / 10 % 3 == 0) && (i / 10 != 0)) {
                    System.out.print("짝");
                }
                if ((i % 10 % 3 == 0) && (i % 10 != 0)){
                    System.out.print("짝");
                }
            System.out.println();
        }

            //강사님 답안
//        for(int k = 1; k <= 1000; k++) {
//            System.out.printf("k = %d ", k);
//            int copy = k; //원본값 보존
//
//            do{
//                int oneDigit = copy % 10;
//                if(oneDigit % 3 == 0 && oneDigit != 0){
//                    System.out.print("짝");
//                }
//            }while((copy /= 10) > 0);
//            System.out.println();
//        }

        /* while 문 사용
        for(int k = 1; k <= 100; k++) {
            System.out.printf("k = %d ", k);

            int copy = k; //원본값 보존
            while (copy > 2) {
                int oneDigit = copy % 10;
                if (oneDigit % 3 == 0 && oneDigit != 0) {
                    System.out.print("짝");
                }
                copy /= 10;
            }
            System.out.println();

        }

         */

    } //main

}
