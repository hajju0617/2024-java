package com.green.day2;

public class Var2 {

    int globalnum; // 전역변수  (2.main 메소드 안에서 사용못함 -> why? static 이 없으므로 객체화 부터 해야 한다)
    /*
    main 메소드 안에서 globalnum이라는 전역변수를 직접적으로 사용할 수 없다
    그 이유는 main 메소드가 static으로 선언되어 있기 때문
    static 메소드는 인스턴스 생성 없이 호출되므로 인스턴스 변수에 직접 접근할 수 없습니다
    globalnum은 인스턴스 변수이므로 객체가 생성되어야만 접근 가능

    main 메소드에서 globalnum에 접근하려면
    먼저 Var2 클래스의 인스턴스를 생성한 후 그 인스턴스를 통해 globalnum에 접근할 수 있습니다.

    (main) static 메소드에서 다른 메소드를 호출하는 것은 가능합니다
    하지만 호출 가능한 메소드의 종류는 static 메소드가 호출되는 방식에 따라 달라집니다.
    1 - static 메소드에서는 다른 static 메소드를 직접 호출할 수 있습니다
    (static 메소드나 변수가 클래스에 속하고, 인스턴스 생성 없이 사용할 수 있기 때문)
    2 - 인스턴스 메소드는 static 메소드에서 직접 호출할 수 없습니다
    (인스턴스 메소드는 객체가 생성될 때만 존재하므로 static 메소드에서 인스턴스 메소드를 직접 호출하려면 먼저 해당 클래스의 객체를 생성해야 함)
     */


    public static void main(String[] args) {       // 1.static 을 유심히 보자
//        Var2 myVar = new Var2(); // <- 객체화 (Var2 클래스의 인스턴스 생성)
//        myVar.globalnum = 10; // 인스턴스를 통해 globalnum에 접근 및 수정
//        System.out.println(myVar.globalnum); // 인스턴스를 통해 globalnum의 값을 출력

        int num = 10, num2 = 11, num3 = 0; // 지역변수 (항상 초기화)
        // 지역 변수 명과 전역 변수 명은 같아도 되지만 안 하는 게 나음

        num3 = num + num2;
        System.out.println(num3);

        num3 = num3 + 3;
        System.out.println(num3);

        num3++;
        ++num3;
        num3++;
        System.out.println(num3);
        

    }
}
