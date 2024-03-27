package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        /*
         배열을 사용하는 이유? -> 같은 타입의 여러값을 연속적으로 저장하기 위해서
         배열의 특징 -> 크니는 고정(생성 후 크기 변경x)
         index 로 접근 한다
         index 는 0번부터 시작되고 마지막 index 값은 배열 크기 -1 값이다.
         */
        int n1 = 10, n2 = 20, n3 = 30, n4 = 40, n5 = 50;

        System.out.println(n1);
        n1 = 11;
        System.out.println(n1);

        int[] numArr = new int[10];
        System.out.println("numArr[0] : " + numArr[0]);
        numArr[0] = 11;
        System.out.println("numArr[0] : " + numArr[0]);

        int[] numArr2 = {10, 20, 30 ,40 ,50};
        System.out.println("numArr2[1] : " + numArr2[1]);
        numArr2[1] = 25;
        System.out.println("numArr2[1] : " + numArr2[1]);
        int[] numArr3 = new int[] {10,20,30};

        String[] strArr = new String[5];


    }
}
