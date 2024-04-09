package com.green.day19;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1 2 3";
        String[] strArr = str.split(" ");   // 스페이스바를 기준으로 숫자 하나씩으로 나눔 -> "1 2 3" => {"1","2","3"}
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        int[] intArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
    }
}

class Exam {

}
