package Study.hajju.ch6;
class Data1 {
    int value;
}
class Data2 {
    int value;
    Data2(int x) {
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(10);     // compile error 발생 10을 넣어주면 됨
    }
}
