package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args) {
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(10);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));  // 원래 equals는 주소값 비교이다 but String때는 오버라이딩이 된 것.
    }   //main
}

class Numbox {
    private int num;
    Numbox(int num) {
        this.num = num;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Numbox) {
            Numbox numbox = (Numbox) obj;
            return this.num == numbox.num;
        }
        return false;
    }
}
