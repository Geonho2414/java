package ch12;

public class Main {
    public static void main(String[] args) {
        //추상클래스
        //JavaAbstract javaAbstract = new JavaAbstract(); //추상클래스는 인스턴스화 안됨
        ch12_2_JavaChild javaChild = new ch12_2_JavaChild(); //추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());

        ch12_2_JavaChild javaChild1 = new ch12_2_JavaChild(20, "Apple");
        System.out.println(javaChild1.getValue());
        System.out.println(javaChild1.getString());

        ch12_2_JavaChild javaChild2 = new ch12_2_JavaChild();
        javaChild2.setValue(999);
        javaChild2.setString("Banana");
        System.out.println(javaChild2.getValue());
        System.out.println(javaChild2.getString());



        //인터페이스
        ch12_5_interfaceChild a = new ch12_5_interfaceChild();
        a.abc();
        a.bcd();
        ch12_5_interfaceChild b = new ch12_5_interfaceChild();
        b.bcd();

        System.out.println(ch12_4_interface2.a);
        System.out.println(ch12_3_interface.a);



        //익명클래스
        ch12_3_interface a2 = new ch12_3_interface() {
            public void abc() {
                System.out.println("난 익명 이너 클래스");
            }
        };
        a2.abc();

        //<인터페이스 생성 방법 1>
        // 자식클래스를 선언하고 해당 인터페이스를 상속하게 하면
        // 아래와 같이 동일한 코드 내용(메서드 오버라이딩 내용)을 계속해서 사용할 수 있음
        ch12_5_interfaceChild c2 = new ch12_5_interfaceChild();
        ch12_5_interfaceChild c3 = new ch12_5_interfaceChild();
        ch12_5_interfaceChild c4 = new ch12_5_interfaceChild();

        //<인터페이스 생성 방법 2>
        // 아래와 같이 익명 이너 클래스 형식으로 생성하면,
        // 방법 1에서와 같이 재사용할 수 있는 클래스 이름이 없음으로
        // 동일한 코드 내용(메서드 오버라이딩 내용)을 매번 복사 붙여넣기 해줘야 함
        ch12_3_interface a3 = new ch12_3_interface() {
            public void abc() {
                System.out.println("난 익명 이너 클래스");
            }
        };
    }
}
