public class ch5_classTraining1 {
    static int a = 1;
    static int b = 2;
    public static void main(String[] args) {
        System.out.println(plusNums());
        System.out.println(plusNums(4,5));
        int[] intArray = {1,2,3,4,5};
        System.out.println(plusNums(intArray));
    }
    // 메소드의 오버로딩
    public static int plusNums() {
        return a + b;
    }
    public static int plusNums(int x, int y) {
        return x + y;
    }
    public static int plusNums(int[] intArray) {
        int sum = 0;
        for (int i=0; i< intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }

    //가변길이 배열 입력법이 필요한 이유
    public static int plusNums(int a, int b, int c, int d,int e) {
        return a + b + c + d + e;
    }
    public static int plusNums(int a, int b, int c, int d,int e, int f) {
        return a + b + c + d + e + f;
    }
    //너무 복잡함

    public static int plsNums(int... values) {
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }
}