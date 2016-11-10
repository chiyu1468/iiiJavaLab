package tw.org.iii.picardtest.netStatement;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// Server - 傳文字
public class TCP_Receiver {
    public static void main(String[] agrs){
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Waiting...");
            Socket sSocket = server.accept();

            System.out.println("HandShaking OK...");
            // 取得 client 資料
            String urip = sSocket.getInetAddress().getHostAddress();
            System.out.println(urip + ":");




            // 這樣可以產生一個 InputStream 物件實體
            InputStream a = sSocket.getInputStream();



            // 因為處理文字檔 所以用BufferedReader 建立一個管子 把兩個 socket 接在一起
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(a));


            // 讀取 socket
            String line;
            while ( (line = br.readLine()) != null ){
                System.out.println(line);
            }





            // 結束管線
            br.close();



            // 關閉Server
            server.close();
            System.out.println("Server Get");
        } catch (Exception e) {
        }
    }
}
