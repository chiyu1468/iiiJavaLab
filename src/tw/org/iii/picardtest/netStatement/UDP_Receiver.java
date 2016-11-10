package tw.org.iii.picardtest.netStatement;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Receiver {
    public static void main(String[] agrs){
        // 製造容器
        byte[] buf = new byte[1024];
        try {
            // 準備插座 打開通道
            DatagramSocket socketRx = new DatagramSocket(8888);
            // 指定接收容器
            DatagramPacket packetRx = new DatagramPacket(buf,buf.length);
            // 設定用哪個插座 處理特定容器
            System.out.println("Before");
            socketRx.receive(packetRx);
            System.out.println("After");
            // 隨手關燈
            socketRx.close();




            String urip = packetRx.getAddress().getHostAddress();
            int len = packetRx.getLength();
            byte[] message = packetRx.getData();
            System.out.println(urip + ":" + len);
            System.out.println(message.toString());





        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}



