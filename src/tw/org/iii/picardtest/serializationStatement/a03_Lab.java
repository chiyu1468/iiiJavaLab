package tw.org.iii.picardtest.serializationStatement;

import java.io.*;

public class a03_Lab {
    public static void main(String[] aagre){

        // 序列化
        try {
            Chiyu383 obj = new Chiyu383();
            ObjectOutputStream Oout = new ObjectOutputStream(
                    new FileOutputStream("dir1/chiyu2.oo"));
            Oout.writeObject(obj);
            Oout.flush();
            Oout.close();
        } catch (Exception e) {
            System.out.println("1." + e.toString());
        }

        System.out.println("---------------------------------------");


        // 解序列化
        try {
            ObjectInputStream Oin =
                    new ObjectInputStream(
                            new FileInputStream("dir1/chiyu2.oo"));

            Chiyu383 obj2 = (Chiyu383) Oin.readObject();
            Oin.close();
        } catch (Exception e) {
            System.out.println("2." + e.toString());
        }


    }
}

class Chiyu381 {
    Chiyu381(){System.out.println("Chiyu381()");}
}
class Chiyu382 extends Chiyu381 implements Serializable {
    Chiyu382(){System.out.println("Chiyu382()");}
}
class Chiyu383 extends Chiyu382 {
    Chiyu380 obj;
    Chiyu383(){obj = new Chiyu380(); System.out.println("Chiyu383()");}
}

// 在class裡面的屬性 也要序列化
class Chiyu380 implements Serializable{}
