public class ch5_arrayTraining4_String {
    public static void main(String[] args) {

        //String class 특징1
        // 리터럴형태(new 라는 키워드 없이 " "사이에 직접 값을 쓰는 것)로 값변경시 새로운 메모리 위치에 생성
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str2);

        //String class 특징2
        //리터럴을 바로 입력한 데이터는 문자열이 같을 때 하나의 객체를 공유한다
        String str3 = new String("안녕");
        String str4 = "안녕";
        String str5 = "안녕";
        System.out.println(str5 == str4);
    }
}
