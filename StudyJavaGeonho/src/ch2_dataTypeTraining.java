public class ch2_dataTypeTraining {
    public static void main(String[] args) {
       //문자열 뒤에 오는 숫자는 같은 문자로 인식
        System.out.println("화면 출력");
        System.out.println("화면"+"출력");
        System.out.println(3.8);
        System.out.println(3+5);
        System.out.println("화면" + 3);
        System.out.println("화면"+3+5);
        System.out.println(3+5+"화면");

        //기본 자료형
        boolean a = false; //true or false
        byte b = 1; //1byte
        short c = 10; //2byte
        int d = 1000; //4byte
        long f = 1000000; //8byte
        float g = 3.5f; //4byte 소숫점 **꼭 f를 붙일 것!
        double h = 335.3335; //8byte 소숫점
        char i = 'a'; //문자
        //참조자료형
        String j = "안녕"; //문자열

        //자료형 간의 타입 변화
        int value1 = (int)5.3;
        float value2 = (float)5;
    }
}
