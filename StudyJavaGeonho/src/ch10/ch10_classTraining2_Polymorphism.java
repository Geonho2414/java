package ch10;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class ch10_classTraining2_Polymorphism {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        A a3 = new C();
        A a4 = new D();

        B b2 = new B();
        B b3 = new C();
        B b4 = new D();

        C c2 = new C();

        D d4 = new D();
    }
}
