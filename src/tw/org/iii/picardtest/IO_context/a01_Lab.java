package tw.org.iii.picardtest.IO_context;

import java.io.*;

/*
 * 支援所有檔案
 * InputStream
 *  - FileInputStream
 * OutputStream
 *  - FileOutputStream
 *
 *
 */




public class a01_Lab {

    public static void main(String[] agrs){
        try {
            FileInputStream fin1 = new FileInputStream("Dir1/file2");
            FileInputStream fin2 = new FileInputStream("Dir1/file2");
            FileInputStream fin3 = new FileInputStream("Dir1/file2");

            int rb; char cb;
            while ((rb=fin1.read()) != -1){
                cb = (char)rb;
                System.out.print(cb + "\t");
                System.out.println(rb);
            }

            System.out.println("==========================================");

            //  Big5  中文編碼 佔 2個byte
            //  UTF-8 中文編碼 佔 3個byte
            byte[] buf = new byte[3]; int len;
            while ((len=fin2.read(buf)) != -1){
                System.out.print(new String(buf,0,len));
            }


            System.out.println("\n==========================================");

            File myFile = new File("Dir1/file2");
            long bigLen = myFile.length();
            byte[] bigbuf = new byte[(int)bigLen];
            fin3.read(bigbuf);
            System.out.println(new String(bigbuf));







            // 隨手關燈 是好習慣
            fin1.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }

}
