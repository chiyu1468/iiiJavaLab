package tw.org.iii.picardtest.IO_context;

import java.io.FileOutputStream;

public class a03_Output {
    public static void main(String[] agra){
        try {
            FileOutputStream fout = new FileOutputStream("dir1/file3", true);
            // 檔案開關 自動建立新檔案

            fout.write("Hello, Chiyu \n".getBytes());



            // 要準備關燈 通知系統快點把資料寫到硬體裡面
            fout.flush();
            // 隨手關燈
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
