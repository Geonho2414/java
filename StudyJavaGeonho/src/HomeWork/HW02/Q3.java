package HomeWork.HW02;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함

        // 여기 코드 작성 !!
        Scanner scan = new Scanner(System.in);
        List<String> ListUntil5 = new ArrayList<>();
        System.out.println("문자열 5개를 입력하세요 : ");
        for (int i = 0; i < 5; i++) {
            String input = scan.nextLine();
            if(input == input)
            ListUntil5.add(input);
        }
    }
}
