package com.green.day13.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] intArr = { 10, 20 };

        System.out.printf("intArr[0] : %d, intArr[1] : %d\n", intArr[0], intArr[1]); // 10,20

        change(intArr);

        System.out.printf("intArr[0] : %d, intArr[1] : %d\n", intArr[0], intArr[1]); // 11,21출력되도록
    }

    static void change(int[] Arrn) { //intArr 주소값을 매개변수로 받음 (주소값이므로 반환값이 없는 void 이지만 값이 변경됨)
        // 하드코딩
        Arrn[0] = 11;
        Arrn[1] = 21;

        for(int i = 0; i < Arrn.length; i++) {
            Arrn[i] += 1;      // int[i] Arrn = intArr[i] 구도

        }
    }
}
