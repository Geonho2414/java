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
    }
}
