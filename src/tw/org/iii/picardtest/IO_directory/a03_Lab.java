package tw.org.iii.picardtest.IO_directory;

import java.io.File;

public class a03_Lab {
    public static void main(String[] args) {
        // 尋訪程式
        File dir1 = new File("dir1");
        if(dir1.isDirectory()){
            File[] sub = dir1.listFiles();
            for(File subFile : sub){
                System.out.println(subFile.getName());
            }
        }


        File[] roots = File.listRoots();
        for (File myRoot : roots){
            System.out.println(myRoot.getAbsolutePath());
        }



    }
}