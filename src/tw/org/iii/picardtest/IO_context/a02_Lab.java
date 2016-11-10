package tw.org.iii.picardtest.IO_context;

import java.io.*;

/*
 *
 * 專門為了文字檔案
 * Reader
 *  - InputStreamReader (轉接頭)
 *      - FileReader
 *
 * Writer
 *
 */



public class a02_Lab {

    public static void main(String[] agrs){
        try {

            FileReader reader1 = new FileReader("Dir1/file2");
            int c;
            while ( (c = reader1.read()) != -1){
                System.out.print((char)c);
            }

            // 隨手關燈 是好習慣
            reader1.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }

}
