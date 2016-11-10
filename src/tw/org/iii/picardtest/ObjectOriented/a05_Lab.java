package tw.org.iii.picardtest.ObjectOriented;

// TODO --- 重要概念: 比 Constructor 更早執行的 initialization block
// initialization block 就是在"記憶體"分配時 就需要做的事
// 其實就跟定義變數是一樣的 在"記憶體"分配時，就會做。
// 而 Constructor 是在"記憶體"分配完成後，對這個物件實體進行初始化。

public class a05_Lab {
    public static void main(String[] agrs){
//        Chiyu351 obj1 = new Chiyu351();
//        Chiyu351 obj2 = new Chiyu351();
        System.out.println("\n ====================");
        Chiyu351.m2();
        System.out.println("\n ====================");
        Chiyu353 obj1 = new Chiyu353();
    }
}

class Chiyu351{
    // Constructor
    Chiyu351(){System.out.println("Chiyu351:Constructor"); a = 9;}
    // 一般的物件方法
    void m1(){System.out.println("Chiyu351:m1");}
    int m3() {System.out.println("A Way Do things before Constructor"); return 5;}
    // 一般的類別方法
    static void m2(){System.out.println("Chiyu351:m2");}

    // class level initialization block (類別等級的初始區塊程式)
    // 類別只會被分配一次
    static  {System.out.println("Chiyu351:static initialization block");}

    // object level initialization block (物件等級的初始區塊程式)
    // 每次物件的建立 都需要分配記憶體
    // 這裡用了一個很弔詭的手段 讓一般的方法 在 Constructor 之前就執行
    int a = m3();
    {System.out.println("Chiyu351:instance initialization block / a = " + a);}


}
class Chiyu352 extends Chiyu351 {
    Chiyu352(){System.out.println("Chiyu352:Constructor");}

    void m1(){System.out.println("Chiyu352:m1");}
    static void m2(){System.out.println("Chiyu352:m2");}

    int a = 2;
    {System.out.println("Chiyu352:instance initialization block/ a = " + a);}

    static  {System.out.println("Chiyu352:static initialization block");}
}
class Chiyu353 extends Chiyu352 {
    Chiyu353(){System.out.println("Chiyu353:Constructor");}

    void m1(){System.out.println("Chiyu353:m1");}
    static void m2(){System.out.println("Chiyu353:m2");}

    int a = 3;
    {System.out.println("Chiyu353:instance initialization block/ a = " + a);}

    static  {System.out.println("Chiyu353:static initialization block");}
}
