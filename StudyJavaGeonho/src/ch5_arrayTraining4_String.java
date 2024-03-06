import java.util.Arrays;
import java.util.Scanner;

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

        System.out.println(1 + "Hi");
        System.out.println(1 + 2 + "Hi");
        System.out.println("Hi" + 1 + 2); //hi12 : 문자가 숫자랑 더해질 시 숫자는 더이상 숫자의 역할을 하지 못함

        //문자열 길이
        String Str1 = "Hello Java!";
        String Str2 = "안녕하세요, 반갑습니다!";
        System.out.println(Str1.length());
        System.out.println(Str2.length());
        System.out.println();

        //문자열 검색
        //@charAt()
        System.out.println(Str1.charAt(1));
        System.out.println(Str2.charAt(1));
        System.out.println();

        // @indexOf(), lastIndexOf()
        System.out.println(Str1.indexOf('a'));
        System.out.println(Str1.lastIndexOf('a'));
        System.out.println(Str1.indexOf('a', 8));
        System.out.println(Str1.lastIndexOf('a', 8));
        System.out.println(Str1.indexOf("Java"));
        System.out.println(Str1.lastIndexOf("Java"));
        System.out.println(Str2.indexOf("하세요"));
        System.out.println(Str2.lastIndexOf("하세요"));
        System.out.println(Str1.indexOf("bye"));
        System.out.println(Str2.lastIndexOf("고맙습니다."));
        System.out.println();

        //문자열 변환 및 연결
        //String Str3 = String.valueOf(2.3);
        double dValue = 2.3;
        String Str3 = String.valueOf(dValue);
        //String Str4 = String.valueOf(false);
        boolean bool = false;
        String Str4 = String.valueOf(bool);
        System.out.println(Str3);
        System.out.println(Str4);

        // @concat() 문자열 연결
        String Str5 = Str3.concat(" " + Str4);
        System.out.println(Str5);

        String Str6 = "Hello Java!";
        String Str7 = "안녕하세요";

        //@gerBytes() 문자열 -> byte[] 변환
        byte[] array1 = Str6.getBytes();
        byte[] array2 = Str7.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        //@toCharArray() 문자열 -> char[] 변환
        char[] array3 = Str6.toCharArray();
        char[] array4 = Str7.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

        //문자열 수정
        //@toLowerCase(), toUpperCase
        String str10 = "Java Study";
        System.out.println(str10.toLowerCase());
        System.out.println(str10.toUpperCase());

        //@replace()
        System.out.println(str10.replace("Study", "공부"));
        // Study를 못찾으면 변경하지 않고 원본 그대로 둠

        // @substring()
        System.out.println(str10.substring(0, 5));
        //두번째 파라미터로 사용된 인덱스는 포함되지 않음 (0 <= 범위 < 5)

        //@split
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));
        // 연산자를 이용하여 '/'와 '-', ' '기준으로 분리시킴
        // split 메소드의 리턴형은 string[문자열의 배열이다]

        //@trim
        System.out.println("    abc def    ".trim());
        //앞뒤 공백지우기(가운데 곻백은 지우지 않음)
        System.out.println("    abc def    ".replaceAll(" ",""));
        //모든 공백을 지우기

        System.out.println();

        // 문자열의 내용 비교
        String str11 = new String("Java");
        String str12 = new String("Java");
        String str13 = new String("Java");

        //@stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str11 == str12);
        System.out.println(str12 == str13);
        System.out.println(str11 == str13);

        //@equals(), @equalsIgnorCase(): 내용 비교
        System.out.println(str11.equals(str12));
        System.out.println(str12.equals(str13));
        System.out.println(str12.equalsIgnoreCase(str13));


        // 1.길이가 10인 배열에 1부터 10까지 값을 입력하시오
        //내 생각
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
        //강사님의 답
        int[] intList1 = new int[10];
        for (int i=0 ; i<10 ; i++) {
            intList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));
        //++
        int[] intList2 = new int[3];
        int[] intList3 = {100, 200, 300};
        for (int i=0 ; i<3 ; i++) {
            intList1[i] = intList3[i];
        }
        System.out.println(Arrays.toString(intList3));


        // 2.길이가 10인 배열에 1부터 10까지 값을 거꾸로 입력하시오
        // 내가 생각한 답
        int[] intList4 = new int[10];
        int[] intList5 = {10,9,8,7,6,5,4,3,2,1};
        for (int i=0 ; i<10 ; i++) {
            intList4[i] = intList5[i];
        }
        System.out.println(Arrays.toString(intList4));
        //강사님의 답
        int[] intList6 = new int[10];
        int len = intList6.length;
        for (int i=0 ; i<intList6.length ; i++) {
            intList6[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList6));


        // 3. 아래 과일 배열에 "사과"가 몇번 들어있는지 확인
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for (int i=0; i<fruitList.length; i++) {
            if (fruitList[i]== "사과") {
                count = count +1;
            }
        }
        System.out.println(count);

        //자바에서 사용자 입력을 받는 법
        Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();
        if (inputNumber >=0 && inputNumber <=6) {
            System.out.println(inputNumber);
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
        System.out.print(inputNumber);


        //자바에서 문자열을 입력받는 방법
        Scanner sc1 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputStr = sc1.nextLine();
        System.out.println(inputStr);


        // 4. 사용자로부터 1~7까지 숫자를 입력 받아 아래 배열에 해당하는 요일을 출력
        // 내가 적은 코드
        char[] week = {'일','월','화','수','목','금','토'};
        Scanner sc2 = new Scanner(System.in);
        System.out.print("1~7까지 숫자를 입력해주세요 : ");
        int inputNumber1 = sc2.nextInt();
        if (inputNumber1 == 1) {
            System.out.println(week[0]);
        }else if(inputNumber1 == 2){
            System.out.println(week[1]);
        }else if(inputNumber1 == 3){
            System.out.println(week[2]);
        }else if(inputNumber1 == 4){
            System.out.println(week[3]);
        }else if(inputNumber1 == 5){
            System.out.println(week[4]);
        }else if(inputNumber1 == 6){
            System.out.println(week[5]);
        }else if(inputNumber1 == 7) {
            System.out.println(week[6]);
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
        //강사님이 적은 코드
        char[] week1 = {'일','월','화','수','목','금','토'};
        Scanner sc3 = new Scanner(System.in);
        System.out.print("1~7까지 숫자를 입력해주세요 : ");
        int num = sc3.nextInt();
        for(int i=0; i< week.length; i++) {
            if (num >= 0 && num <=6) {
                System.out.println(week[num]);
                break;
            }else {
                System.out.println("잘못 입력하셨습니다");
            }
        }

        
        //5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        //"~~~님 환영합니다" 출력
        //없으면 "회원 가입해주세요"를 출력 (단, 대소문자를 구분하지 마시오)
        String[]members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner sc4 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputStr1 = sc4.nextLine();
        boolean found = false;
        for(int i=0; i< members.length; i++) {
            if (members[i].equalsIgnoreCase(inputStr1)) {
                System.out.println("환영합니다");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("잘못 입력하셨습니다");
        }
        //또 다른 방법
        /*for (int i=0; i< members.length; i++);{
            if (members[i].equalsIgnoreCase(inputStr1.toLowerCase())) {
                System.out.println(members[i] + "님 환영합니다");
                break;
            }
        }
        if (i == members.length - 1) {
            System.out.println("회원가입해주세요");*/
    }
}

