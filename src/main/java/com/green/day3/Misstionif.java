package com.green.day3;

import java.util.Scanner;
// 하단 Scanner 클릭후 alt + enter

// Primitive Type은 원시타입, Referance Type은 참조 타입이고 참조 타입의 값은 주소이다.
// 보통 첫 문자가 소문자 이면 Primitive 대문자면 Referance
// 원시 타입 은 정수, 실수, 문자, 논리 리터럴 등의 실제 데이터 값을 저장하는 타입이고,
// 참조 타입은 객체(Object)를 참조(주소를 저장) 하는 타입으로 메모리 번지 값을 통해 객체를 참조하는 타입이다
// 참조 타입은 원시 타입을 제외한 타입들(문자열, 배열, 열거, 클래스, 인터페이스)
// Call by value는 매개 변수로 변수에 할당되어 있는 값을 복사하여 전달하는 것을 말하고,
// Call by reference는 매개 변수로 변수 자체의 주소 값을 복사하여 전달하는 것을 말한다.
public class Misstionif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("성별을 입력 해주세요. (남/여) >> ");
        String gender = scan.nextLine();


        // 지금까지 배운거로만 해결!
        // 만약 "남" >> "당신은 남자입니다."
        // 만약 "여" >> "당신은 여자입니다."
        // 만약 "남,여"도 아니면 > "성별을 입력 해주세요"

        if(gender.equals("남")) {
            System.out.println("당신은 남자입니다");
        }
        else if (gender.equals("여")) {
            System.out.println("당신은 여자입니다.");
        }
        else {
            System.out.println("성별을 다시 입력 해주세요.");
        }
        // gender = null; 일 경우 에러가 발생하므로 gender와 "남","여"의 위치를 바꿔서 쓰는 게 베스트
    }
}
