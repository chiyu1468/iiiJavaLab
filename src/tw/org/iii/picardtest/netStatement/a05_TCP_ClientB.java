package tw.org.iii.picardtest.netStatement;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

// Client - 傳圖片 (切成一段段)
public class a05_TCP_ClientB {
    public static void main(String[] agrs){
        long time = System.currentTimeMillis();
        try {
            // 1. 製作插座
            Socket cSocket = new Socket(InetAddress.getByName("127.0.0.1"),9999);

            // 3. 外管建立
            OutputStream out = cSocket.getOutputStream();

            // 2. 內管建立 - 開檔
            FileInputStream fin = new FileInputStream("dir1/test.jpg");
            int b;
            // 把檔案切成一個個byte 在送出去
            while ((b = fin.read()) != -1){
                out.write(b);
            }
            // 內管關閉 - 關檔
            fin.close();

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
