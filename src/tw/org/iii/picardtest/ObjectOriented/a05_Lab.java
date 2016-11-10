package tw.org.iii.picardtest.ObjectOriented;

// TODO --- 重要概念

public class a05_Lab {
    public static void main(String[] agrs){
//        Chiyu351 obj1 = new Chiyu351();
//        Chiyu351 obj2 = new Chiyu351();
//        System.out.println("\n ====================");
//        Chiyu353.m2();

        Chiyu353 obj1 = new Chiyu353();
        Chiyu353 obj2 = new Chiyu353();
    }
}

class Chiyu351{
    // Constructor
    Chiyu351(){System.out.println("Chiyu351:Constructor"); a++;}
    void m1(){System.out.println("Chiyu351:m1");}
    static void m2(){System.out.println("Chiyu351:m2");}

    // 物件程式區塊
    int a;
    {System.out.println("Chiyu351:instance / a = " + a);}
    // 類別程式區塊
    static  {System.out.println("Chiyu351:static");}

}
class Chiyu352 extends Chiyu351 {
    Chiyu352(){System.out.println("Chiyu352:Constructor");}

    void m1(){System.out.println("Chiyu352:m1");}
    static void m2(){System.out.println("Chiyu352:m2");}

    int a;
    {System.out.println("Chiyu352:instance / a = " + a);}

    static  {System.out.println("Chiyu352:static");}
}
class Chiyu353 extends Chiyu352 {
    // Constructor
    Chiyu353(){System.out.println("Chiyu353:Constructor");}

    void m1(){System.out.println("Chiyu353:m1");}
    static void m2(){System.out.println("Chiyu353:m2");}

    int a;
    {System.out.println("Chiyu353:instance / a = " + a);}
    static  {System.out.println("Chiyu353:static");}
}
