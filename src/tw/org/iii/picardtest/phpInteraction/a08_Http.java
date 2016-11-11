package tw.org.iii.picardtest.phpInteraction;


import tw.org.iii.picardtest.phpInteraction.Multipartutility;

import java.io.File;
import java.io.IOException;

public class a08_Http {
    public static void main(String[] args){
        try {
            Multipartutility mt =
                    new Multipartutility("http://127.0.0.1/java+php/a01_Lab.php","utf-8");

            mt.addFilePart("upload",new File("dir1/file2"));

            mt.finish();

            System.out.println("Done!");

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
