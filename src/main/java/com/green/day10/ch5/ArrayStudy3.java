package com.green.day10.ch5;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {
        int[] nArr1 = { 10, 20, 30 };
        int[] nArr2 = nArr1; //nArr1의 주소값을 nArr2에 복사 (Shallow copy(얕은 복사))

        /*
        얕은 복사(Shallow Copy)와 깊은 복사(Deep Copy)는 객체를 복사하는 방법에 따른 분류입니다.

        얕은 복사(Shallow Copy)는 원본 객체의 메모리 주소를 복사하여 새로운 객체를 생성하는 방법입니다
        이 경우 새로운 객체와 원본 객체는 동일한 메모리를 공유하므로, 원본 객체가 변경되면 새로운 객체도 변경됩니다.

        깊은 복사(Deep Copy)는 원본 객체의 모든 값을 새로운 메모리에 복사하여 새로운 객체를 생성하는 방법입니다
        이 경우 새로운 객체와 원본 객체는 서로 독립적이며, 원본 객체가 변경되어도 새로운 객체는 변경되지 않습니다.
         */

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        nArr2[1] = 50;
        nArr1[0] = 80;
        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

    }

}
