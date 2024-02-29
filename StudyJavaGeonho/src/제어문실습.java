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
    }
}
