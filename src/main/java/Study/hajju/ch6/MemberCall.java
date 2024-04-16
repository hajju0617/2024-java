package Study.hajju.ch6;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;      // 클래스 변수는 인스턴스 변수를 사용할 수 X
    static int cv2 = new MemberCall().iv;
    MemberCall mb = new MemberCall();
//    static int cv3 = mb.iv;
//    static int cv4 = iv;

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);

    }
}
