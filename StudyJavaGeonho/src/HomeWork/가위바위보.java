package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {

        String[] 가위바위보 = {"가위", "바위", "보"};
        Random random = new Random();
        int randomIndex = random.nextInt(가위바위보.length);
        String answer = 가위바위보[randomIndex];

        System.out.println("안내면 진거 가위바위보");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(answer.equals(input)){
            System.out.println("비겼습니다.");
        }else if(input=="가위"){
            String a = (answer == "바위") ? "이겼습니다." : "졌습니다.";
            System.out.println(a);
        }else if(input=="바위") {
            String a = (answer == "보") ? "이겼습니다." : "졌습니다.";
            System.out.println(a);
        }else if(input=="보") {
            String a = (answer == "가위") ? "이겼습니다." : "졌습니다.";
            System.out.println(a);
        }else {
            System.out.println("반칙입니다.");
        }
    }
}
