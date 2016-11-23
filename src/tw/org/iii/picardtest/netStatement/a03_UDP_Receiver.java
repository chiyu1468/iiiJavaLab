package tw.org.iii.picardtest.netStatement;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class a03_UDP_Receiver {
    public static void main(String[] agrs){

        // 製造容器
        byte[] buf = new byte[1024];

        try {
            // 準備插座 打開通道
            DatagramSocket socketRx = new DatagramSocket(8888);
            // 製造接收容器
            DatagramPacket packetRx = new DatagramPacket(buf,buf.length);
            System.out.println("Before");
            // 指定用哪個插座 處理特定容器 並等待接收
            socketRx.receive(packetRx);
            System.out.println("After");
            // 關閉通道
            socketRx.close();


            // 處理收到的資料
            String urip = packetRx.getAddress().getHostAddress();
            int len = packetRx.getLength();
            byte[] message = packetRx.getData();
            System.out.println(urip + ":" + len);
            System.out.println(message.toString());


        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }
    }
}