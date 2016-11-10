package tw.org.iii.picardtest.abstractStatement;

// TODO --- Static 類別級的變數 與 方法

public class a01_static_Statement {
    static public void main(String[] agrs){
        Chiyu241 c1 = new Chiyu241("car");
        Chiyu241 c2 = new Chiyu241("coin");
        Chiyu241 c3 = new Chiyu241("toy");
        // static 表示類別共同擁有的東西
        // =============== 屬性 ===================

        // a 是每個物件自己的
        System.out.println("c1.a=" + c1.a);
        System.out.println("c2.a=" + c2.a);
        System.out.println("c3.a=" + c3.a);
        // b 是 Chiyu241 這個類別的
        System.out.println("b=" + c1.b);
        System.out.println("b=" + c2.b);
        System.out.println("b=" + c3.b);
        // 甚至不需要透過任何物件就可以動用
        Chiyu241.b += 5;
        System.out.println("Chiyu241.b=" + Chiyu241.b);

        // =============== 方法 ===================

        Chiyu241.sayHello();
        c1.takeItem();
        c1.sayHello();

    }


}

class Chiyu241 {
    // 物件級的屬性
    int a;
    String things;
    // 類別級的屬性 (static 這個"類別"一起擁有的變數)
    static int b;
    Chiyu241(String item){
        things = item;
        a++;
        b++;
    }

    // 物件級的方法 先有物件 會用到物件內的屬性 才能運作的方法
    void takeItem(){
        System.out.println("CHIYU has a " + things);
    }

    // 類別級的方法 不需物件產生 不需要用物件內任何屬性
    static void sayHello(){
        System.out.println("Hello CHIYU");
    }




}