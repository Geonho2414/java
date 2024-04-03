package ch18.ch18_2_Lambda;

interface A {
    void method1(); //입력 업고 리턴 없음
}
interface B {
    void method2(int x); //입력있고 리턴 없음
}
interface C {
    int method3(); //입력 없고 리턴 있음
}

interface D {
    double method4(int x, double y); // 입력있고 리턴있음
}

public class ch18_2_1_Lambda {
    public static void main(String[] args) {
        //인터페이스의 함수 구현 -> 람다식
        //1. 입력 X, 리턴 X
        //1-1. 익명 이너 클래스 방식
        A a1 = new A(){
            @Override
            public void method1(){
                System.out.println("입력 X 리턴 X 함수");
            }
        };
        a1.method1();
        // 1-2 람다식 표현
        A a2 = () -> {System.out.println("입력 X 리턴 X 함수 1");};
        A a3 = () -> System.out.println("입력 X 리턴 X 함수"); //한 줄 명령은 중괄호 생략

        B b = (int x) -> System.out.println("pattern 2 : " + x);
        B b1 = (x) -> System.out.println("pattern 3 : " + x);
        B b2 = x -> System.out.println("pattern 4 : " + x);
        b2.method2(5);

        C c = () -> { return 4;}; // 리턴이 있으므로 중괄호가 필요하다.
        C c1 = () -> 4; // 리턴을 생략하려면 중괄호고 같이 생략
        System.out.println(c1.method3());

        D d = (int x, double y) -> {return x+y;};
        D d1 = (int x, double y) -> x+y;
        D d2 = (x, y) -> x + y;
        System.out.println(d2.method4(10, 5.5));
    }
}
