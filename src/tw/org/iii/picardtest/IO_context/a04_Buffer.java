package tw.org.iii.picardtest.IO_context;

import java.io.*;

/**
 * Created by mmm on 2016/11/7.
 */
public class a04_Buffer {
    public  static void main(String[] args){
        try {

/*
 *    ┌──────┐                                            ┌──────┐
 *    │          │      br           irs            fin       │          │
 *    │          │ ============  ------------  .............. │          │
 *    │   JAVA   │                                            │  File    │
 *    │          │ ============  ------------  .............. │          │
 *    │          │                                            │          │
 *    └──────┘                                            └──────┘
 *          // 原來的概念
 *          //FileInputStream fin = new FileInputStream("dir1/file2");
 *          //InputStreamReader irs = new InputStreamReader(fin);
 *          //BufferedReader br = new BufferedReader(irs);
 *
 *          // 接成一條管子 所以關哪一條 都可以 (整條就關起來了)
 *          // br.close();
 *
 */
            // 真正的寫法
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream("dir1/file2")));

            // 上面是故意要闡明 管子的連接 這個case只要接兩段 就可以有同樣的功能
            BufferedReader br2 = new BufferedReader(new FileReader("dir1/file2"));



            String line;
            int i = 1;
            while ( (line = br.readLine()) != null){
                System.out.println(i++ + " >> " + line);
            }




            // 同一條管子 所以關哪一條 都可以 (整條就關起來了)
            br.close();br2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
