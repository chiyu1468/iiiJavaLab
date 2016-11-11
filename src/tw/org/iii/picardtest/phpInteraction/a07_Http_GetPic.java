package tw.org.iii.picardtest.phpInteraction;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


// 上網抓東西
public class a07_Http_GetPic {
    public static void main(String[] args){
        try {

            // 圖片
            //URL url = new URL("https://i.ytimg.com/vi/bLaacA3JjzA/hqdefault.jpg");
            // 利用別人的網路服務
            URL url = new URL("http://pdfmyurl.com/?url=http://www.bbc.com/news");

            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            // 交握
            conn.connect();

            // 外管建立 連接網路資料
            InputStream in = conn.getInputStream();
            // 內管建立 連接本機檔案
            FileOutputStream fout = new FileOutputStream("dir1/dir11/news.pdf");

            // 讀取檔案
            byte[] buf = new byte[4096];
            int len;
            while ((len = in.read(buf)) != -1){
                fout.write(buf,0,len);
            }


            // 內管關閉
            fout.flush();
            fout.close();
            // 外管關閉
            in.close();

            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }

    }
}
