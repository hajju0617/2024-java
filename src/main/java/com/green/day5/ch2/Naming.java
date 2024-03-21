package com.green.day5.ch2;

import java.io.PrintStream;

public class Naming {
    public static void main(String[] args) {
        /*
        네이밍 규칙
        <변수 명명 규칙>

        1. 대소문자가 구분되며 길이 제한x
         */
        int abc, Abc, aBc, abC;
        int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;

        // 2.예약어 사용 금지
//        int public;
//        int void;
        int string; //string은 클래스명 (되긴 하나 안 하는 것이 낫다)

        //3.숫자로 시작x , 숫자로 시작하는 것만 아니면 어느 위치든 상관x
//        int 1abc;

        //4.특수기호는 '_', '$'만 허용
        int _123, $123;

        //5. 여러 단어로 구성된 이름은 카멜 케이스 기법을 사용한다.
        //ex. last, index, of -->> lastIndexOf
        //    happy, sunday, morning -->> happySundayMorning

        //6. 케밥 케이스 기법
        //   happy-sunday-morning

        //7. 스네이크 케이스 기법
        //   happy_sunday_morning

        /* <클래스 명명규칙>
        1. 클래스 이름의 첫 글자는 무조건 대문자로 시작@@@@@@@@@@@@@@@@
        2. 여러 단어로 구성된 이름은 첫 글자를 모두 대문자로 한다. -> 파스칼 케이스 기법
        ex) last,index,of -->> LastIndexOf
            string, buffer -->> StringBuffer
         */

        // 상수 명명 규칙
        // 1. 상수 이름은 모두 대문자로 한다. 단어 구분은 '_'로 한다.
        // 2. 데이터 타입 앞에 final 키워드가 들어간다.
        // 3. 1번 방식으로 이름을작성하는 건 primitive type, String 일 때 하는 편이다.
        //ex) last, index, of -->> LAST_INDEX_OF
//              string, buffer -->> STRING_BUFFER
        final int LAST_INDEX_OF = 10;
        final String NAME = "홍길동";

        PrintStream ps = System.out; //(out은 상수 -->> 마우스 올려서 확인)
    }
}
