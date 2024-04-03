package com.green.day15.ch7;
/*
패키지 쓰는 이유
 1. 자바 파일을 관리하기 위해 분류 용도
 2. 똑같은 이름의 클래스를 구분하기 위해
 */
import com.green.day13.ch6.Card;
import com.green.day14.ch6.MyArrays;
import static com.green.day14.ch6.MyArrays.printArr;

public class PackageTest {
    public static void main(String[] args) {
        Card c = new Card();        // day 13에 있는 Card
        com.green.day12.ch6.Card card2 = new com.green.day12.ch6.Card();

        int[] arr = { 1, 2, 3 };
        MyArrays.printArr(arr);
        printArr(arr);
    }
}
