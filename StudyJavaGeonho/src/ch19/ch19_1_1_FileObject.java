package ch19;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ch19_1_1_FileObject {
    public static String CURRENT =
            "C:/Users/admin/Documents/GitHub/java/StudyJavaGeonho/temp";
    public static void main(String[] args) {
        String currentPath = System.getProperty("user.dir");
        System.out.println(currentPath);
        // 절대경로
        File tempDir = new File("C:/Users/admin/Documents/GitHub/java/StudyJavaGeonho/temp");
        if (tempDir.exists()){
            System.out.println("폴더가 이미 존재합니다");
        }else {
            System.out.println("폴더를 생성합니다");
            tempDir.mkdir();
        }

        // 파일생성
        File newFile = new File(CURRENT + "/newFile.txt");
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e){
                System.out.println("IOException 예외");
            }
        }else  {
            System.out.println("이미파일 생성");
        }

        // File 객체가 가르키는 대상(폴더또는 파일)의 절대경로 확인
        System.out.println("절대경로 위치 : "+ newFile.getAbsoluteFile());


    }
}
