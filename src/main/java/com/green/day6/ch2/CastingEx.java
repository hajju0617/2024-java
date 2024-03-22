package com.green.day6.ch2;

public class CastingEx {
    public static void main(String[] args) {
        // primitive type, reference type 같은 카테고리끼리는 형변환이 된다.
        // primitive type -> reference type으로 형변환은 안 된다. (보통 int->string)
        // reference type -> primitive type으로 형변환은 안 된다. (보통 string -> int)
        // 이때는 파싱처리 (Wrapper class 제외)
        // 자바에서 파싱(Parsing)이란, 문자열이나 데이터를 분석하여 원하는 정보를 추출하는 과정
        /*
        문자열을 정수로 변환하는 예시
        String str = "10";
        int num = Integer.parseInt(str);
        위 코드에서는 문자열 "10"을 정수로 변환하기 위해 Integer.parseInt() 메소드를 사용합니다.
        이 메소드는 문자열을 파싱하여 정수 값을 반환합니다.

        문자열을 실수로 변환하는 예시
        String str = "3.14";
        double num = Double.parseDouble(str);
        위 코드에서는 문자열 "3.14"를 실수로 변환하기 위해 Double.parseDouble() 메소드를 사용합니다.
        이 메소드는 문자열을 파싱하여 실수 값을 반환합니다.

        이와 같이, 문자열을 다른 데이터 타입으로 변환하기 위해서는 해당 데이터 타입의 파싱 메소드를 사용해야 합니다.
         */
        int n1 = 10;
        Integer n2 = n1;

        double d1 = 10.0;
        Double d2 = d1;

        // 강제형변환, 자동형변환
        // byte -> short -> int -> long -> float -> double (-> string(+연산자일 때만)논외))
        // 강제형변환은 <- 방향으로 진행

        long l1 = 100000000L;
        float f1 = l1;
        System.out.println("f1 : " + f1);

        long l2 = (long)f1;
        System.out.println("l2 : " + l2);
    }
}
