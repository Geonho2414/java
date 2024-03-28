package ch7.ch7_1_Field;

//클래스 생성
class B {
    //필드를 초기화하지 않았을때 : 강제 초기화
    boolean m1;
    int m2;
    double m3;
    String m4;
    void printField() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
    //지역변수를 초기화 하지 않았을때 : 오류 발생
    void printLocal (){
        int k;
        //System.out.println(k);  오류발생
    }
}
public class ch7_1_2_FieldInitialValue {
    public static void main(String[] args) {
        B b = new B();
        b.printField();
    }
}
