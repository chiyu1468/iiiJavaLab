package tw.org.iii.picardtest;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Server - 傳圖片 (切成一段段)
public class TCP_Receiver {
    public static void main(String[] agrs){
        try {
            // 1.製作插座
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Waiting...");
            Socket sSocket = server.accept();

            System.out.println("HandShaking OK...");
            // 取得 client 資料
            String urip = sSocket.getInetAddress().getHostAddress();
            System.out.println(urip + ":");

            // 3. 內管建立
            FileOutputStream fout = new FileOutputStream("dir1/dir11/new.jpg");

            // 2. 外管建立
            InputStream in = sSocket.getInputStream();
            int b;
            while ((b = in.read()) != -1){
                fout.write(b);
            }

            // 外管關閉
            in.close();

            // 內管建立
            fout.flush();
            fout.close();

            // 關閉插座
            server.close();
            System.out.println("Server Get");
        } catch (Exception e) {System.out.println("Server:" + e.toString());}
    }
}
