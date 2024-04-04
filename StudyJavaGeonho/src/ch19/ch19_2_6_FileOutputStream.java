package ch19;

import javax.tools.FileObject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ch19_2_6_FileOutputStream {
    public static void main(String[] args) throws IOException {
        // 파일 데이터 출력
        // 1. 파일 대상 설정
        File outFile = new File(ch19_1_1_FileObject.CURRENT + "/file2.txt");
        if(!outFile.exists()) {
            outFile.createNewFile();
        } else {
            System.out.println("이미 파일이 있습니다");
        }
        // 2. 대상에 연결되는 stream 생성
        OutputStream os = new FileOutputStream(outFile);
        // 3. 데이터 쓰기
        // (안 좋은 예시 : 하나씩 쓰기)
        os.write('J');
        os.write('A');
        os.write('V');
        os.write('A');
        os.write('\r'); // 캐리지 리턴(carriage return)
        os.write('\n'); // 라인 피드(line feed)
        os.write('S');
        os.write('\n'); // 라인 피드(line feed)

        os.flush(); // 버퍼에 담겨있는 데이터를 파일에 쓰는 메서드
        // 4. stream 종료
        os.close();

        // 5. 데이터 쓰기
        // (좋은 예시 : 한번에 쓰기)
        // 두번째 파라미터(boolean append)는 기존 파일에 있던 데이터를 삭제하고 쓸지
        // 뒤에 이어서 슬지 결정하는 것(true = 이어쓰기)
        OutputStream os2 = new FileOutputStream(outFile, false);
        // getBytes()는 문자열을 바이트 배열로 변경시켜주는 메서드
        byte[] byteArray = "Spring and Database\r\n".getBytes();
        //writ()는 매개변수에 바이트 배열 형태로 넣어주면 배열에 담긴 데이터를 모두 쓴다
        os2.write(byteArray);
//        os2.write('\r');
//        os2.write('\n');
        os2.flush();
        os2.close();
    }
}
