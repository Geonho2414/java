package ch14;

public class ch12_MultiCatch {
    public static void main(String[] args) {



        //2. try - catch - finally
        try {
            System.out.println(3 / 1);
            int a = Integer.parseInt("20A");
        }
        catch (ArithmeticException e) {
            System.out.println("숫자는 0으로 나눌 수 없습니다");
        }
        catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다");
        }
        finally {
            System.out.println("프로그램 종료");
        }
    }
}
