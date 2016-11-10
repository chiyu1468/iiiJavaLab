package tw.org.iii.picardtest.serializationStatement;

// 重要概念 要讀出 被序列化的物件 必須"認識" 原來的類別
// 現在是因為放在相同package下 所以這邊"看"的到
// 不然就要 import 了

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class a02_ReadOO {
    public static void main(String[] agrs){
        try {
            ObjectInputStream Oin =
                    new ObjectInputStream(
                            new FileInputStream("dir1/chiyu.oo"));

            // 讀進來只是一個 Object
            Object obj = Oin.readObject();
            // 需要強制轉型別
            //Student s3 = (Student) obj; // 故意轉錯
            StudentSeries s3 = (StudentSeries) obj;

            System.out.println(s3.name + ":" + s3.avgScore() + ":" + s3.totalScore());
            System.out.println(s3.getAge());

            Oin.close();
        } catch (ClassNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
