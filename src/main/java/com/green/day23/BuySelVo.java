package com.green.day23;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class BuySelVo { // Vo = value Object
    private String memId;
    private int buyCount;

    public BuySelVo(String memId, int buyCount) {
        this.memId = memId;
        this.buyCount = buyCount;
    }

    public String getMemId() {
        return memId;
    }

    public int getBuyCount() {
        return buyCount;
    }

    @Override
    public String toString() {
        return "BuySelVo{" +
                "memId='" + memId + '\'' +
                ", buyCount=" + buyCount +
                '}';
    }
} // class BuySelVo



/*
<Non IoC>                           <IoC>                                외부객체
new A();                             A a;       <------객체 주입(DI)----- new A()
new B();                             B b;       <------객체 주입(DI)----- new B()
IoC는 제어의 역전이라는 뜻으로 객체가 자신이 사용할 오브젝트를 스스로 선택하지 않으며
자신이 어떻게 만들어지고 사용되는 지에 대한 정보도 알 수 없도록 하는 기법입니다
즉, 제어권을 타 객체에게 넘겨주어 자신이 사용하는 객체에 대한 컨트롤을 하지 않습니다.
 */







