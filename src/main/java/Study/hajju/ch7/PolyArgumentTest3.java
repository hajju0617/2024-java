package Study.hajju.ch7;
import org.checkerframework.checker.units.qual.C;

import java.util.*;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();

    }
}
class Product {
    int price;
    int bonusPoint;
    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price / 10.0);
    }
}
class Tv extends Product {
    Tv() {
        super(100);
    }
    @Override
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    @Override
    public String toString() { return "Computer"; }
}
class Audio extends Product {
    Audio() {
        super(50);
    }
    @Override
    public String toString() { return "Audio"; }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없음");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구매했다.");
    }
    void refund (Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품은 없습니다.");
        }
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for(int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.printf("구입하신 물품의 총금액은 %d만원 입니다.\n", sum);
        System.out.printf("구입하신 제품은 %s입니다.\n", itemList);
    }
}

