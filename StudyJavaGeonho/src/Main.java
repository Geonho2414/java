import ch7.ch7.ch6_classTraining;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        //ch7_classTraining 실습
        ch6_classTraining Raina = new ch6_classTraining("Raina", 21, "평택", "enfp", 040615);
        ch6_classTraining Tom = new ch6_classTraining("Tom", 22, "대전", "entj",123456);
        ch6_classTraining Paul = new ch6_classTraining();
//        Paul.name = "paul";
//        Paul.age = 23;
//        Paul.address = "계룡";
//        Paul.mbti = "cute";
        Paul.setName("Paul");
        Paul.setAge(23);
        Paul.setAddress("계룡");
        Paul.setMbti("cute");
        Raina.displayAll();
        Tom.displayAll();
        Paul.displayAll();

        // 메서드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {123,456,789,345};
        getSumAvg(numberList);
        getSumAvg(numberList2);
    }

    //ch7_classTraining 실습
    static void getSumAvg(int[] numberList) {
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);
    }
}
// https://github.com/hyungwonseo/java
// 눈으로 보지 말고 진짜로 하자! 최대한 원리를 이해하고 내가 스스로 써보자