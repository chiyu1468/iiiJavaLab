package tw.org.iii.picardtest.netStatement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

// Client - 傳圖片 (一水桶丟出去)
public class a05_TCP_ClientC {
    public static void main(String[] agrs){
        long time = System.currentTimeMillis();
        try {
            // 檔案整個先讀進來
            File source = new File("dir1/test.jpg");
            byte[] buf = new byte[(int)source.length()];
            FileInputStream fin = new FileInputStream(source);
            fin.read(buf);
            fin.close();

            // 1. 製作插座
            Socket cSocket = new Socket(InetAddress.getByName("127.0.0.1"),9999);

            // 3. 外管建立
            OutputStream out = cSocket.getOutputStream();

            // 把剛剛存取完的檔案 一次丟出來
            out.write(buf);

            // 外管關閉
            out.flush();
            out.close();

            // 關閉插座
            cSocket.close();
            System.out.println("Transfer Done");
            System.out.println(System.currentTimeMillis() - time);
        } catch (Exception e) {System.out.println("Client :" + e.toString());}
    }
}
