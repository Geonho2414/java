package ch4;

public class ch4_controlStatementTraining {
    public static void main(String[] args) {
        //if 단독사용
        boolean x = true;
        if (x) {
            System.out.println("테스트중");
        }
        if (!x) {
            System.out.println("이건 안보일걸!");

        }
        // if ~ else
        if (x) {
            System.out.println("x는 true");
        } else {
            System.out.println("x는 false");
        }
        System.out.println();

        //if ~ else 의 중복사용
        boolean a = false;
        boolean b = true;
        boolean c = true;
        if (a) {
            System.out.println("a가 true");
        } else if (b) {
            System.out.println("a는 false, b가 true");
        } else if (c) {
            System.out.println("a,b가 false, c가 true");
        } else {
            System.out.println("a,b,c는 false");
        }

        // 범위 조건식 (100퍼센트 범위를 커버해야함 중요!)
        // 중복해당 되도록 조건을 만들면 안됨
        int score = 91;
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80 && score < 90) {
            System.out.println("B학점");
        } else if (score >= 70 && score < 80) {
            System.out.println("C학점");
        } else if (score >= 60 && score < 70) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }

        //관계가 없는 조건을 if else로 선정하면 안됨, 아래 예시는 잘못된 예시
       /* int num = 4;
        if (num > 0) {
            System.out.println("num은 양수");
        } else if (num% 2==0) {
            System.out.println("num은 짝수");
        }*/

        //독립적인 if문으로 만들어라
        int num = 4;
        if (num >0){
            System.out.println("num은 양수");
        }
        if (num % 2==0){
            System.out.println("num은 짝수");
        }
        //if문 속에 if문
        if (true){
            if (true){
                if (true){
                    System.out.println("it문 속에 if문");
                    System.out.println();
                }
            }
        }
        //Switch case
        //가끔 함께 실행하기 위해서 break를 쓰는 경우가 있다
        int X = 3;
        switch (X) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }

        /* for 반복 제어분
        for문의 기본형 : for (초기식; 조건식; 증감식)
        초기식 : 조건
        조건식 : 조건을 빠져나오기 위한 조건
        증감식 : 조건의 행동
        ex : for (int i = 0; i < 10; i = i+1) */
        for (int i = 0; i <= 100; i = i+5) {
            System.out.println(i);
        }
        System.out.println();

        /*무한루프 (공포;; ㄷㄷ 매우매우 위험)
        조건식이 false가 될 수 있는지 여부를 반드시 확인
        for (int i=0; i >= 0; i++) {
            System.out.println(i);
        }*/

        //for문 실습
        int e = 0;
        for(  ; e<3; e++) {
            System.out.println(e + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for(int i = 10; i > 0; i--) {
            System.out.println(i + " ");
        }
        System.out.println();
        for(int i = 0; i < 100; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for(int i = 0; i < 10; i+=2) {
            System.out.println(i + " ");
        }
        System.out.println();
        for(int i = 0, j = 0; i < 10; i++, j++) {
            System.out.println(i + j + " ");
        }
        System.out.println();

        //for문 변형하기
        int i = 0;
        for (  ;  ;  ) {
            if (i < 5) {
                System.out.print(i + " ");
                i++;
            }else {
                break;
            }
        }
        System.out.println();

        //멀티 조건식
        for(int f=0, g=0; f<5 || g<5; f++, g++) {
            System.out.print(f + "_" + g + " ");
        }
        System.out.println();

        //while 문 (의도적인 무한루프에서 자주 쓰임)
        int count = 0; //초기식
        while (count < 5) { //조건식
            System.out.print(count + " ");
            count++; //증감식
        }
        System.out.println();

        /*무한루프
        while(true){
        }*/

        // do ~while 문
        // 먼저 do 실행하기 때문에 7; 7++이어도 일단 7을 출력하고 더한다. 그렇기 때문에 오류없이 7을 출력한다.
        // C나 C++ 말고는 거의 안씀. 옛날에 쓰던게 물려내려온 것이기 때문에 그냥 존재함
        int cnt = 7; //초기식
        do {
            System.out.println(cnt + " ");
            cnt++; //증감식
        } while (cnt < 7); //조건식
        //아래 while문과 비교하면,
        //반복문의 조건이 처음부터 false인 경우,
        // do~while문은 실행코드가 1회 실행되는 반면. while문은 실행되지 않음!
        int cnt2 = 5;
        while (cnt2 < 5) {
            System.out.println(cnt + " ");
            cnt2++;
        }

        //이중루프, 이중반복문
        for (int h = 0; h<5; h++) {
            for (int j=0; j<5; j++) {
                System.out.println("[h=" + h + ", j=" + j + "]");
            }
        }
        System.out.println();
    }
}
