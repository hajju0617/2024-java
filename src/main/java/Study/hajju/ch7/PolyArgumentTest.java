package Study.hajju.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyerp1 b = new Buyerp1();

        b.buy(new Tvp1());
        b.buy(new Computerp1());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}

class Productp1 {
    int price;
    int bonusPoint;
    Productp1(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
}
class Tvp1 extends Productp1 {
    Tvp1() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computerp1 extends Productp1 {
    Computerp1() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Buyerp1 {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Productp1 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다");
    }
}
