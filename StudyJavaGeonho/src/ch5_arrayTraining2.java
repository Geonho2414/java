public class ch5_arrayTraining2 {
    public static void main(String[] args) {

        //배열 선언법
        int[] intArray1; //자바스타일!!
        int intArray2[]; // c언어 스타일

        //배열 객체 생성
        int[] intArray3 = new int[5]; //메모리에 5개의 저장소를 만듬
        //배열 객체에 값 입력
        intArray3[0] = 10;
        intArray3[1] = 20;
        intArray3[2] = 30;
        intArray3[3] = 40;
        intArray3[4] = 50;
        for (int i=0; i<5; i++) {
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        
    }
}
