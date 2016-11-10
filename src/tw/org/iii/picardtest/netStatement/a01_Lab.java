package tw.org.iii.picardtest.netStatement;

// 沒有 Constructor 的 class (如: InetAddress ...)
// 就不能用 new 方法 取得物件實體
// 只能透過自身的 static 方法

import java.net.InetAddress;
import java.net.UnknownHostException;

public class a01_Lab {
    static public void main(String[] agrs){
        try {
            InetAddress ip = InetAddress.getByName("www.microsoft.com");
            System.out.println(ip.getHostAddress());
            System.out.println("OK");
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host");
        }
    }
}
