package ch18.ch18_2_Lambda;

interface AC {
    int[] methodAC(int length);
}
public class ch18_2_3_ArrayConstructor {
    public static void main(String[] args) {
        // 함수형 인터페이스 메서드가 입력된 갯수만큼의 정수 배열을 리턴하는 경우
        AC a0 = new AC() {
            @Override
            public int[] methodAC(int length) {
                return new int[length];
            }
        };
        AC a1 = (int length) -> { return new int[length]; };
        AC a2 = int[]::new;

        int[] array1 = a2.methodAC(10);
        System.out.println(array1.length);
        int[] array2 = a2.methodAC(20);
        System.out.println(array2.length);
    }
}

