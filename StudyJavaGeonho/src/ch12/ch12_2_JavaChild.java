package ch12;

public class ch12_2_JavaChild extends ch12_1_JavaAbstract {
    public ch12_2_JavaChild() {
        super();
    }
    public ch12_2_JavaChild(int a, String b) {
        super(a, b);
    }

    //추상메서드에서 반드시 있어야 하는것
    @Override
    public String getString() {
        return b;
    }

    public void setValue(int a) {
        super.setValue(a); // 자바스타일. 자바는 세터와 게터를 사용하는 것을 추천함!!
        // super.a = a; // 비추천. 자바스타일 아님
    }

    public void setString(String b) {
        super.setString(b);
    }
}

