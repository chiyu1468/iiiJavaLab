package tw.org.iii.picardtest.abstractStatement;


// TODO --- 抽象類別介紹
public class a01_Lab {
    public static void main(String[] args){
        Chiyu251 obj1 = new Chiyu251();

        // 抽象類別無法定義出 物件實體
        // 因為 Chiyu252 是半成品 所以不能用
        //Chiyu252 objX new Chiyu252();


        // 爸爸要一台車子
        Chiyu252 obj2, obj3;

        // 這個兒子給我法拉利
        obj2 = new Chiyu252e1();
        // 這個兒子給我保時捷
        obj3 = new Chiyu252e2();

        obj2.m2(); obj3.m2();



    }
}

//  正常類別
class Chiyu251{
    int a;
    void m1(){}
    void m2(){}
}

// 抽象類別 => 一個類別 肚子裡面有任何"抽象類別" 可以當作功能不完整的半成品
abstract class Chiyu252{
    int a;
    void m1(){}
    // 抽象方法 => 有定義名字 (可能甚至有輸入 有回傳) 但是沒有"實作方法"
    abstract void m2();
}

// 抽象類別要用子類別來將父類別定義完整
// 爸爸的夢想 靠兒子完成的感覺 (當然也可以是兒子做不到 找孫子完成的狀況)
class Chiyu252e1 extends Chiyu252{
    void m2(){
        System.out.println("Chiyu252e1:法拉利");
    }
}

// 也可以有兩三個以上的兒子 做出不同的成果
class Chiyu252e2 extends Chiyu252{
    void m2(){
        System.out.println("Chiyu252e2:保時捷");
    }
}
