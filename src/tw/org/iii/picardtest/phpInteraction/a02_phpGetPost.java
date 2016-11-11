package tw.org.iii.picardtest.phpInteraction;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class a02_phpGetPost {
    public static void main(String[] args){
        try {

            // 這是我自己的php
            URL url = new URL("http://127.0.0.1/java+php/a01_Lab.php?x=早安~&y=chiyu");

            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            // 交握
            conn.connect();


            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    conn.getInputStream()));

            String line;
            line = br.readLine();
            System.out.println(line);


            br.close();


            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }

    }
}
