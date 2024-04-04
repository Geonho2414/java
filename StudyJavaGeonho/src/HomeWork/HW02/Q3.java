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
        while (ListUntil5.size() < 5) {
            String input = scan.nextLine();
            //중복 거르기
            if (!ListUntil5.contains(input)) {
                //저장하기
                ListUntil5.add(input);
            } else {
                System.out.println("이미 입력된 문자열입니다. 다른 문자열을 입력하세요 : ");
            }
        }
        System.out.println("저장된 문자열 : " + ListUntil5);
    }
    //숙제완료
}
