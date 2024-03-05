public class ch5_arrayTraining4_String {
    public static void main(String[] args) {

        //String class 특징1
        // 리터럴형태(new 라는 키워드 없이 " "사이에 직접 값을 쓰는 것)로 값변경시 새로운 메모리 위치에 생성
        // String 객체 변수는 값이 수정되지 않고 항상 새로운 값을 만듬!!
        String str1 = new String("안녕");
        String str2 = str1;
        str1 = "안녕하세요";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println();

        //String class 특징2
        //리터럴을 바로 입력한 데이터는 문자열이 같을 때 하나의 객체를 공유한다
        //리터럴로 입력되는 값은 런타임 이전에 이미 메모리로 만들어짐
        String str3 = new String("안녕");
        String str4 = "안녕";
        String str5 = "안녕";
        System.out.println(str5 == str4);
        System.out.println(str5 == str3);
        System.out.println(str5.equals(str3));
        System.out.println();

        //문자열의 '+' 연산
        String str6 = "Hello";
        String str7 = "World";
        System.out.println(str6 + " " + str7);
        String str8 = str6 + " " + str7;
        System.out.println(str8);
        System.out.println();

        System.out.println(1+"Hi");
        System.out.println(1+2+"Hi");
        System.out.println("Hi"+1+2); //hi12 : 문자가 숫자랑 더해질 시 숫자는 더이상 숫자의 역할을 하지 못함
    }
}
