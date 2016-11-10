package tw.org.iii.picardtest.abstractStatement;

// TODO --- 介面介紹

public class a02_Lab {
    public static void main(String[] args){

    }
}

// 一般類別
class Chiyu261{
    void m1(){}
    void m2(){}
}

// 抽象類別
abstract class Chiyu262{
    void m1(){}
    abstract void m2();
}

// 介面 => 全部都是抽象方法的一種特例類別
// 可以視為一種"規格"
// 介面、規格是對所有人公開  所以所有的屬性與方法都是public
interface Chiyu263{
    // 這種類別 "無Constructor"
    // 然而也沒有任何實做方法 可以去變更屬性值
    // 所以不能無值宣告
    // int a;
    int b = 1;

    void m1();
    void m2();
}

// 運用介面建立的類別
class Chiyu263i implements Chiyu263 {
    // 因為 介面的方法 都是 public 所以 這邊只能用 public
    // private void m1(){}
    public void m1(){}
    public void m2(){}
}
