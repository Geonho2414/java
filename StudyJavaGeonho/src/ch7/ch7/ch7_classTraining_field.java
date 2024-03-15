package ch7.ch7;


class Working {
    int m = 5;
    int n = 6;
    void work1(){
        int k = 7;
        System.out.println(k);
        work2(4);
    }
    void work2(int i) {
        int j = 3;
        System.out.println(i+j);
    }
}
public class ch7_classTraining_field {
    public static void main(String[] args) {
        Working a = new Working();
        System.out.println(a.m);
        System.out.println(a.n);
        a.work1();
    }
}
