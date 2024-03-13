package ch10;

class AAA {
    int m = 3;
    void abc () {
        System.out.println("A 클래스");
    }
}
class BBB extends AAA {
    int n = 4;
    void bcd(){
        System.out.println("B 클래스");
    }
}

public class ch10_classTraining4_Typecasting2 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        System.out.println(aaa.m);
        aaa.abc();

        BBB bbb = new BBB();
        System.out.println(bbb.m);
        System.out.println(bbb.n);
        bbb.abc();
        bbb.bcd();

        AAA ab = new BBB();
        System.out.println(ab.m);
        ab.abc();
    }
}
