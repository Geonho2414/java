package ch19;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        File dataFile = new File(ch19_1_1_FileObject.CURRENT + "/dataFile.data");
        if (!dataFile.exists()) {
            dataFile.createNewFile();
        }
        InputStream is = new FileInputStream(dataFile);
        OutputStream os = new FileOutputStream(dataFile);

        // 기존의 IO Stream들은 byte단위로만 읽고 쓸 수 있는 반면,
        // DataInputStream/DataOutputStream은 여러 원시자료형의 형태에 맞춰 읽고 쓸 수 있음
        DataInputStream dis = new DataInputStream(is);
        DataOutputStream dos = new DataOutputStream(os);
        //쓰기
        dos.writeInt(35);
        dos.writeDouble(5.8);
        dos.writeChar('A');
        dos.writeUTF("안녕하세요");
        dos.flush();
        //읽기
        int a = dis.readInt();
        double b = dis.readDouble();
        char c = dis.readChar();
        String d = dis.readUTF();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        os.close();
        is.close();
        dos.close();
        dis.close();
    }
}
