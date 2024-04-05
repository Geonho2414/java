package HomeWork.HW01;

import java.util.Scanner;

class Answer {
    void answer (){
        System.out.println("축하합니다! 맞추셨습니다! 당신에겐 엄청난 영애와 영광, " +
                "3번만에 100자리 수 중 하나를 맞추었다는 운의왕 칭호, " +
                "수많은 사람들의 환호와 박수가 주어집니다." );
    }
}

public class Q4 {
    /*
        1) answer값보다 큰 수를 입력했을 경우에는 "더 작은 수를 입력하세요"를 출력하고
        다시 입력값을 받아야함
        2) answer값보다 작은 수를 입력했을 경우에는 "더 큰 수를 입력하세요"를 출력하고
        다시 입력값을 받아야함
        3) answer값과 같은 수를 입력했을 경우에 break를 통하여 반복문을 탈출하고
        "맞췄습니다"를 출력.
        4) 전체 시도횟수를 출력하고 종료.

        <결과예시> (answer값이 60이라고 가정)
        유저 입력값이 50이면, "더 큰 수를 입력하세요" 출력
        다시 유저가 70을 입력하면, "더 작은 수를 입력하세요" 출력
        다시 유저가 60을 입력하면, "맞췄습니다" 출력
        "시도횟수는 3번입니다" 출력하고 종료
    */
    public static void main(String[] args)
    {
        // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 1; // 시도횟수를 세기위한 변수

        Scanner sc = new Scanner(System.in);
        Answer answer1 = new Answer();
        while (count<4) {
            System.out.print("1부터 100사이의 숫자를 입력해주세요 : ");
            input = sc.nextInt();

            //정답시
            if (input == answer) {
                answer1.answer();
                System.out.println("당신의 시도횟수는 " + count + "번입니다.");
                break;
                // 시도횟수 카운트
            }else if (count == 3) {
                    System.out.println("시도횟수는 3번입니다. 남은 시도횟수를 모두 소진하셨습니다.");
                System.out.println("다음에 다시 시도해주세요");
                break;
            //정답이 아닐 시
            } else if (input < answer) {
                System.out.print("더 큰 수를 입력하세요 : ");
            } else if (input > answer) {
                System.out.print("더 작은 수를 입력하세요 : ");
            }
            count++;
        }
    }
}

// 숙제 완료