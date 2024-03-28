package ch7.ch7_1_Field;

class A{
    int m = 3;      //필드
    int n = 4;      //필드
    void work1(){
        int k = 5;      //지역변수
        System.out.println(k);
        work2(3);      //3을 work2 i 인수에다가 대입
    }
    void work2(int i){
        int j = 4;      //지역변수
        System.out.println(i+j);
    }
}
public class ch7_1_1_Field {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        A a = new A();
        //필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);
        //매서드 호출
        a.work1();
    }
}
