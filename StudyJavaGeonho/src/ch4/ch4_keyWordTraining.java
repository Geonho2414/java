package ch4;

public class ch4_keyWordTraining {
    public static void main(String[] args) {

        //break == 제어문의 중괄호를 탈출시키는 키워드
        for (int i=0; i<10; i++) {
            System.out.println(i);
            if (i > 5){
                break;
            }
        }
        System.out.println();


        //이중 for 문에서의 break 사용법
        //print 를 뒤에 두었을때
        for (int i=0; i<5; i++) {
            if (i==3)
                break;
            for (int j=0; j<5; j++){
                if (j==3)
                    break;
                System.out.println(i+", "+j);
            }
        }
        System.out.println();


        //이중 for 문에서의 break 사용법
        //print 를 앞에 두었을때
        for (int i=0; i<5; i++) {
            if (i==3)
                break;
            for (int j=0; j<5; j++){
                System.out.println(i+", "+j);
                if (j==3)
                    break;
            }
        }
        System.out.println();


        //매우 큰 수를 넣었을때
        int MAX = 100000000;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++){
                if (j==3){
                    i = MAX;
                    break;
                }
                System.out.println(i+", "+j);
            }
        }
        System.out.println();


        //바깥 for 문까지 탈출하는 다른 방법
        //효율적이지 않아 많이 사용하지 않음
        //out: 에는 어떤 문자가 들어와도 상관없음
        out:
        for (int i=0; i<5; i++) {
            if (i==3)
                break;
            for (int j=0; j<5; j++){
                if (j==3)
                    break out;
                System.out.println(i+", "+j);
            }
        }
        System.out.println();


        //continue 사용법
        for (int i=0; i<10; i++){
            if (i % 2 == 1) {  //홀수의 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }
        System.out.println();


        //이중 for 문에서의 continue
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j==3) {
                    continue;
                }
                System.out.println(i+", "+j);
            }
        }
        System.out.println();
    }
}
