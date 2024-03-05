import java.util.Arrays;

public class ch5_arrayTraining3 {
    public static void main(String[] args) {

        //기본 자료형(스택)의 복사
        int a = 3;
        int b = a;
        System.out.println(a + " " + b); // 3, 3
        b = 5;
        System.out.println(a + " " + b); // 3, 5


        //참조 자료형(힙)의 복사 ==> 참조복사, 주소복사
        int[] intList1 = {3,4,5};
        int[] intList2 = intList1;
        System.out.println(Arrays.toString(intList2)); // [3, 4, 5]
        intList2[0] = 10;
        System.out.println(Arrays.toString(intList2)); // [10, 4, 5]
        System.out.println(Arrays.toString(intList1)); // [10, 4, 5]


        //배열과 for 문의 사용
        //조건식에 배열의 갯수(length)를 적어 사용
        for (int i=0; i<intList2.length; i++) {
            System.out.print(intList2[i]+ " ");
        }
    }
}
