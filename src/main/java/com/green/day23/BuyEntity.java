package com.green.day23;

// 객체 vs 개체

/*
객체(Object)
객체는 "클래스"에서 정의된 속성(Attribute)과 행동(Method)을 실체화한 것
객체 지향 프로그래밍(OOP)에서 객체는 데이터와 그 데이터를 조작하는 메서드를 포함합니다.

개체: 개체는 현실 세계에서 존재하는 사물이나 개념을 컴퓨터에서 표현한 것을 말함
개체는 객체와 달리 데이터만 가지고 있으며, 데이터를 처리하는 함수(메소드)를 가지고 있지 않음
개체는 데이터베이스에서 사용되는 용어로 데이터베이스에서는 개체를 테이블(Table)로 표현합니다.

데이터베이스에서 개체(Entity) 는 데이터베이스에 저장되는 데이터의 단위를 말함
개체는 하나 이상의 속성(Attribute)과 관계(Relationship)를 가지고 있음

테이블(Table) 은 데이터베이스에서 개체를 저장하는 공간
 */
public class BuyEntity {
    private int num;
    private String memId;
    private String prodName;
    private String groupName;
    private int price;
    private int amount;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}//class BuyEntity
