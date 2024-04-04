package ch19;

import javax.tools.FileObject;
import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(ch19_1_1_FileObject.CURRENT + "/fileio.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        //쓰기
        OutputStream os = new FileOutputStream(file, false);
        byte[] arrayByte = "Hello World. Let's study spring framework.".getBytes
                (Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();
        //getBytes(Charset.forName("UTF-16")) = 강제적으로 16바이트로 바꿔줌

        //읽기
        InputStream is = new FileInputStream(file);
        int data;
        byte[] buffer = new byte[1000];
        String str = "";
        while ((data = is.read(buffer)) != -1) {
            str = str +  new String(buffer, 0, data,
                                    Charset.forName("UTF-8"));
        }
        System.out.println(str);
        is.close();
        //String str = new String(buffer, Charset.forName("UTF-16"));
        // = 쓸때 16이었다면, 읽을때도 16으로
    }
}
