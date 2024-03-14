package ch10.ch10_classTraining3_5_Typecasting;

class E {}
class F extends E {}
public class ch10_classTraining5_Typecasting3 {
    public static void main(String[] args) {
        E ee = new E();
        E ef = new F();

        System.out.println(ee instanceof E);
        System.out.println(ef instanceof E);

        System.out.println(ee instanceof F);
        System.out.println(ef instanceof F);

        if (ee instanceof F) {
            F f = (F) ee;
            System.out.println("ee 를 F 로 캐스팅했습니다.");
        } else {
            System.out.println("ee는 F타입으로 캐스팅이 불가능!!!");
        }
        if (ef instanceof F) {
            F f = (F) ef;
            System.out.println("ef를 F로 캐스팅했습니다");
        } else {
            System.out.println("ef는 F 타입으로 캐스팅이 불가능!!!");
        }
        if ("안녕" instanceof String){
            System.out.println("\"안녕\"은 String 클래스입니다.");
        }
    }
}
