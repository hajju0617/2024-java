package com.green.day16.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Product p = new Product(1000);
        Product p2 = new Product(500);

        System.out.printf("price : %d\n", p.getPrice());
        System.out.printf("bonusPoint : %d\n", p.getBonusPoint());
        System.out.printf("price : %d\n", p2.getPrice());
        System.out.printf("bonusPoint : %d\n", p2.getBonusPoint());

        System.out.println("------------------");
        System.out.println(p);
        System.out.println(p2);
        System.out.println("-----------------------");

        Tv tv = new Tv();
        System.out.println(tv);
        System.out.println("-------------------------");

        Computer c = new Computer();
        System.out.println(c);
        System.out.println("-------------------------");

        Sofa sofa = new Sofa();
        System.out.println(sofa);
        System.out.println("-------------------------");

        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
        buyer.showMeTheMoney();
    }
}


class Buyer {
    private int haveMoney;
    private int haveBonusPoint;
    Buyer(int haveMoney) {
        this.haveMoney = haveMoney;
    }
    public void buy(Product p) {
        haveMoney -= p.getPrice();
        haveBonusPoint += p.getBonusPoint();
        System.out.printf("%s을(를)구매하였습니다\n", p);
    }
    public void showMeTheMoney() {
        System.out.printf("haveMoney : %,d , haveBonusPoint : %,d\n", haveMoney, haveBonusPoint );

    }
}
class Sofa extends Product {
    Sofa() { super(80);}
    @Override
    public String toString() {
        return String.format("Sofa %s", super.toString());
    }
}
class Computer extends Product{
    Computer() {super(200); }
    @Override
    public String toString() {
        return String.format("Computer %s", super.toString());
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }
    @Override
    public String toString() {
        return String.format("Tv %s", super.toString());
    }
}

class Product {
    private final int price;
    private final int bonusPoint;
    Product (int price) {
        this.price  = price;
        this.bonusPoint = price / 10;
    }
    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }


    @Override
    public String toString() {
        return String.format("price : %,d, bonusPoint : %,d", price, bonusPoint);
    }
}
