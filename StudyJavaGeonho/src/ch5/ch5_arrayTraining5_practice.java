package ch5;

import java.util.Arrays;

public class ch5_arrayTraining5_practice {
    public static void main(String[] args) {
        //1
        // 아래 배열중에 짝수만 출력
        // 내 답
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 8, 10};
        int cc = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                cc =  arr[i];
            } else if (arr[i] % 1 == 0) {
                continue;
            }
            System.out.println(cc);
        }
        //Gpt의 답
        for (int num : arr) {
            if (num % 2 == 0) { // 짝수인 경우
                System.out.println(num);
            }
        }
        //선생님의 답
        for (int i=0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        //2
        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;
        for(int j=0; j < string.length(); j++) {
            if(string.charAt(j) != ' ')
                count++;
        }
        System.out.println("글자수 : " + count);

        //3
        //코드를 이해하시오
        int [] array = new int [] {1, 2, 3, 4, 5};

        int n = 3;

        System.out.println("Original array: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }

        for(int k = 0; k < n; k++){
            int j, first;

            first = array[0];  // 포인트 1
            for(j = 0; j < array.length-1; j++){
                array[j] = array[j+1];
            }
            array[j] = first;  // 포인트 2
        }
        System.out.println();

        for(int k = 0; k< array.length; k++){
            System.out.print(array[k] + " ");
        }
    }
}
