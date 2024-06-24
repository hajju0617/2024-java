package com.green.day69;

public class UserDtoTest {
    public static void main(String[] args) {
        UserDto dto = new UserDto();
        // 홍길동, 20 삽입 하고 싶음

        dto.setAge(20);
        dto.setName("홍길동");
        dto.setAddr("서울");

        UserChainingDto dto2 = new UserChainingDto();
        dto2.setAge(30).setName("유관순").setAddr("대구");       // 이렇게 3개를 연달아 하고 싶음
                                                                // setter 반환타입을 자기 자신으로 하고
                                                                // return this 하면 됨

        UserChainingDto dd = dto2.setAge(30).setName("유관순").setAddr("대구");
                                                            // 마지막 return 값이 중요
                                                            // why? -> 순차적으로 리턴 하다가 마지막 리턴값이 마지막으로 들어가기 때문
        /*
        1. dto2.setAge(21) 이 메서드 뒤에 . 을 적을 수 있는 이유는 참조변수값을 리턴하기 때문
        2. 1번 리턴 주소값.setName("유관순")
        3. 2번 리턴 주소값.setAddr("대구")
        4. dd = 3번 리턴 주소값
         */


        System.out.println(dto);
        System.out.println(dto2);
    }
}
