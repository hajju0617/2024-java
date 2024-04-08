package com.green.day17.ch11;
import java.util.*;
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        // 기존 arr 크기보다 1칸 더 큰 새로운 배열 생성 후 0번칸에 10 삽입
        // 새로운 배열 주소값을 전역변수 arr에 대입
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println(list); // [10, 20]
        list.showLength();
        int size = list.size();
        System.out.println("size : " + size);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}

class MyArrayList {
    private int[] arr;
    MyArrayList() {
        arr = new int[0];
    }
    void add(int val) {
        int[] tmp = new int[arr.length + 1];    // 기존 arr 보다 +1 큰 배열
        tmp[arr.length] = val;      // tmp 마지막 인덱스 값
        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        this.arr = tmp;
    }
    @Override
    public String toString() {
        //1번
//        String str = "";
//        str += "안녕";
//        str += "하세요";
//        2번
//        StringBuilder tmp = new StringBuilder();
//        tmp.append("안녕");
//        tmp.append("하세요");
        // 1번과 2번은 동일한 과정
        if(arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0]));
        for(int i = 1; i < arr.length; i++) {
            sb.append(String.format(", %d", arr[i]));
        }
        sb.append("]");
        return sb.toString();
//        return Arrays.toString(arr);
    }
    void showLength() {
        System.out.println("len : " + arr.length);
    }
    int size() {
        return arr.length;
    }
    int get(int n) {
        return arr[n];
    }
}