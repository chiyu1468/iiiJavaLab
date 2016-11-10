package tw.org.iii.picardtest.netStatement;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class a06_Http {
    public static void main(String[] agrs){
        try {
            // 輸入網址
            URL url = new URL("http://iiihw2-picard.c9users.io/_HTML5+CSS+JavaScript/20160930/Test%20Vic.html");
            //
            URLConnection urlC = url.openConnection();



            HttpURLConnection httpUrlC = (HttpURLConnection) urlC;
            httpUrlC.connect();
            BufferedReader br = 
                    new BufferedReader(
                            new InputStreamReader(
                                    httpUrlC.getInputStream()));

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }






        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
