public class 제어문실습 {

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
    }
}