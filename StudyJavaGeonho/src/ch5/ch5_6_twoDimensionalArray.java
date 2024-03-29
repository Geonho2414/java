package ch5;

public class ch5_6_twoDimensionalArray {
    public static void main(String[] args) {
        //방법1. 배열객채를 생성하고 값을 대입
        int[][] array1 = new int[2][6];
        array1[0][0]=1;
        array1[0][1]=2;
        array1[0][2]=3;
        array1[0][3]=4;
        array1[0][4]=5;
        array1[0][5]=6;

        System.out.println(array1.length);
        System.out.println(array1[1].length);

        //방법2. 배열객체의 행 성분 먼저 생성
        //2차원 정방행렬이 아닌 경우, 사용가능
        int[][] b = new int[2][];
        b[0] = new int[3];
        b[1] = new int[3];
        b[0][0] = 1;
        b[1][0]=2;
        b[1][1]=3;
        b[1][2]=4;

        //방법3. new키워드와 함께  대입할 값 입력
        //이중 중괄호가 있는 것에 주의!!!!
        int[][] c = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(c.length);
        System.out.println(c[0].length);
        System.out.println(c[1].length);

        //방법4. new키워드 없이 대입할 값만 입력
        int[][] d = {{1,2,3},{4,5,6}};

        //2차원 비정방 배열
        int[][] e = new int[2][];
        e[0]= new int[]{1,2};
        e[0]= new int[]{3,4,5};

        //2차원 배열의 출력
        for(int i=0; i<e.length; i++) {
            for(int j=0; j<e[i].length; j++)
                System.out.println(e[i][j] + " ");
        }
        System.out.println();
    }
}
