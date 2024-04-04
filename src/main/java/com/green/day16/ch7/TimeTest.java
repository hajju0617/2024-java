package com.green.day16.ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10,11,12);
        //time.hour = 10;     // private 로 인해서 불가능
        System.out.printf("hour : %d\n", time.getHour()); // hour 값 호출
        time.setHour(22);   // hour 값 변경
        System.out.printf("hour : %d\n", time.getHour());

    }   //main
}

class Time {
    private int hour;      // 캡슐화(은닉화) -> 생성자와 메서드로 값을 넣을 수 있다.
    private int minute;     // 값 하나당 메소드 (setter 와 getter) 각각 하나씩
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }


























//    // setter
//    public void setHour(int hour) {     // set 뒤에 -> 변수명(첫글자 대문자)
//        this.hour = hour;
//    }
//    public void setMinute(int minute) {     // setter 메소드 특징 : 전부 void
//        this.minute = minute;
//    }
//    public void setSecond(int second) {
//        this.second = second;
//    }
//    // getter
//    public int getHour() {              // get -> 변수명(첫글자 대문자)
//        return hour;
//    }
//    public int getMinute() {            // getter 메소드 특징 : 파라미터가 없음
//        return minute;
//    }
//    public int getSecond() {
//        return second;
//    }
}