package ch7.ch7;

public class ch6_classTraining2 {
    public static void main(String[] args) {
        // 클래스의 생성자가 없는 경우 => 기본 생성자가 자동으로 만들어짐
        // 매개변수가 있는 생성자만 있는 경우 => 기본 생성자는 만들어지지 않는다!!
        // 생성자의 오버로딩
        ch6_classTraining a = new ch6_classTraining();
        ch6_classTraining tom = new ch6_classTraining("tom", 20, "대전", "enfp", 102343);
        ch6_classTraining steve = new ch6_classTraining("steve",20,"LA");
    }
}
