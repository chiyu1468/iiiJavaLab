package tw.org.iii.picardtest.IO_directory;

// TODO --- java.io

import java.io.File;

public class a01_Lab {
    public static void main(String[] args){
        // 因為不同的OS 其 fileSystem 不一樣  IOS 跟 Andriod 都是 Unix Base
        System.out.println(File.pathSeparatorChar); // Windows ;   Unix :
        System.out.println(File.separator);         // Windows \   Unix /

        // 只有 智障的$oftware 用跳脫字元當路徑符號 結果 \t 變成 tab 鍵
        File f1 = new File("C:\test");
        // 要用只能用 \\
        File f2 = new File("C:\\test");
        // 不然換成 / 也可以
        File f3 = new File("C:/test");
        if(f1.exists()){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }


        File f4 = new File(".");
        File f5 = new File("./dir1");
        // 取得目前的絕對路徑
        System.out.println(f5.getAbsolutePath());
        if(f5.exists()){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }

    }
}
