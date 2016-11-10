package tw.org.iii.picardtest.IO_directory;


import java.io.File;

public class a02_Lab {
    public static void main(String[] agrs){
        boolean X,Y;
        // 先把dir2刪掉再玩這段程式

        File dir1 = new File("./dir1");

        // 一次建立一個目錄  mkdir()
        File dir2 = new File("dir2");
        if(dir2.exists()) {
            System.out.println("Exist!");
        } else {
            Y = dir2.mkdir();
            if (Y) {System.out.println("dir2 create!");}
        }

        // 一次把祖宗八代都建立出來 mkdirs()
        File dir2222 = new File("dir2/dir22/dir222/dir2222");
        if(dir2222.exists()) {
            System.out.println("Exist!");
        } else {
            X = dir2222.mkdirs();
            if (X) {System.out.println("dir2222 create!");} else {System.out.println("Fail");}
        }





    }
}
