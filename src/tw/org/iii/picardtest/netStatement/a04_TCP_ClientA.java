package tw.org.iii.picardtest.netStatement;

import java.io.BufferedOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class a04_TCP_ClientA {
    public static void main(String[] agrs){

        try {
            Socket cSocket = new Socket(InetAddress.getByName("10.2.12.126"),9999);

            // 這樣可以產生一個 OutputStream 物件實體
            cSocket.getOutputStream();

            // 建立 socket 管線
            BufferedOutputStream bOut =
                    new BufferedOutputStream(
                            cSocket.getOutputStream());





            // 送出資料
            bOut.write("Hello, Chiyu".getBytes());





            bOut.flush();
            bOut.close();



            cSocket.close();
            System.out.println("OK");
        } catch (Exception e) {

        }


    }
}
