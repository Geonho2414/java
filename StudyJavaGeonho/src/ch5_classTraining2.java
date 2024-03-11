public class ch5_classTraining2 {
    public static void main(String[] args) {
        // 클래스의 생성자가 없는 경우 => 기본 생성자가 자동으로 만들어짐
        // 매개변수가 있는 생성자만 있는 경우 => 기본 생성자는 만들어지지 않는다!!
        // 생성자의 오버로딩
        ch5_classTraining a = new ch5_classTraining();
        ch5_classTraining tom = new ch5_classTraining("tom", 20, "대전", "enfp", 102343);
        ch5_classTraining steve = new ch5_classTraining("steve",20,"LA");
    }
}
