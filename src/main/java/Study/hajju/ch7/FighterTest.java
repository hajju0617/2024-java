package Study.hajju.ch7;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }
interface Fightable extends Movable, Attackable {}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {}
    public void attack(Unit u) {}
}
