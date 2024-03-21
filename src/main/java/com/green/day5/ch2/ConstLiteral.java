package com.green.day5.ch2;

public class ConstLiteral {
    public static void main(String[] args) {
        /*
        literal(리터럴) : 값 그 자체. 현실 세계에서 얘기하는 상수와 같음.
        상수 : 한번 입력된 값이 수정이 안 되는 공간
         */

        //MAX_SPEED가 상수
        //240이 literal(리터럴)
        final int MAX_SPEED = 240;
        final int MAX_VALUE;
        MAX_VALUE = 10;
        // MAX_SPEED = 250; -->> 변경이 불가능 하다. 컴파일 에러 발생.
        // 빨간 줄(문법 오류) -->> 컴파일 에러, 빨간 줄은 아닌데 실행을 해보니 에러 발생 -->> 런타임 에러
    }
}
