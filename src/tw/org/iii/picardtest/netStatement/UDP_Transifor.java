package tw.org.iii.picardtest.netStatement;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Transifor {
    public static void main(String[] agrs) {

        String message = "123456";
        byte[] data = message.getBytes();
        System.out.println(message);

        try {
            // 建立插座 (要傳送出去 port 不重要)
            DatagramSocket socketTx = new DatagramSocket();
            // 建立容器
            DatagramPacket packetTx =
                    new DatagramPacket(data,data.length,
                            InetAddress.getByName("127.0.0.1"),
                            8888);
            // 把容器透過插座 丟出去
            socketTx.send(packetTx);
            // 隨手關燈
            socketTx.close();

            System.out.println("Message Send!");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
