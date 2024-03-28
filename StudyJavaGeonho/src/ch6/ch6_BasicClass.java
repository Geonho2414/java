package ch6;

//클래스 정의
class A {
    int m = 3;
    void hello(){
        System.out.println("안녕");
    }
}
public class ch6_BasicClass {
    public static void main(String[] args) {
        //클래스 객체 생성
        A a = new A();

        //클래스 멤버 활용
        //@필드 활용 : 필드에 값을 읽기/쓰기
        a.m = 5;
        System.out.println(a.m);

        a.hello();
    }
}

