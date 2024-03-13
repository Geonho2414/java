package ch10;

class AA {}
class BB extends AA {}
class CC extends BB{}
class DD extends BB{}

public class ch10_classTraining3_Typecasting {
    public static void main(String[] args) {
        //#1. 업캐스팅 (자동변환): 생략시 컴파일러가 자동 추가
        AA ac = (AA) new CC(); // C->A 업캐스팅 (자동변환)
        BB bc = (BB)new CC(); // C->B 업캐스팅 (자동변환)

        BB bb = new BB();
        AA a = (AA)bb; //B->A 업캐스팅 (자동변환)

        //#2-1. 다운캐스팅 (수동변환) : 캐스팅이 불가능한 경우 (실행시 예외발생)
        AA aa = new AA();
//		B b = (B)aa; //A->B 다운캐스팅 (수동변환)
//		C c = (C)aa; //A->C 다운캐스팅 (수동변환)

        //#2-2. 다운캐스팅 (수동변환) : 캐스팅이 가능한 경우
        AA ab = new BB();
        //10000 라인의 코드가 있음
        //아래에서 ab 변수를 BB 또는 CC 타입으로 캐스팅이 필요할 경우!!!
         if (ab instanceof BB) {
             BB b = (BB)ab;
         } else if (ab instanceof CC) {
             CC c = (CC)ab; //AA->CC 다운캐스팅 (수동변환) : 불가능
         } else {
             System.out.println("둘 다 아니네.. 망했음!!");
         }
        BB b = (BB) ab; //A->B 다운캐스팅 (수동변환)
//		C c = (C)ab; //A->C 다운캐스팅 (수동변환) : 불가능

        BB bd = new DD();
        DD d = (DD)bd; //B->D 다운캐스팅 (수동변환)

        AA ad = new DD();
        BB b1 = (BB)ad; //A->B 다운캐스팅 (수동변환)
        DD d1 = (DD)ad; //A->D 다운캐스팅 (수동변환)
    }
}
