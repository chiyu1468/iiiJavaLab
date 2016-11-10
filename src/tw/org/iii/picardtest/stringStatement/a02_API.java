package tw.org.iii.picardtest.stringStatement;


public class a02_API {
    public static void main(String[] agrs) {
        String s1 = "CHIYU";
        String s2 = "CHIYU";
        String s3 = new String("CHIYU");
        String s4 = new String("CHIYU");
        System.out.print("s1 s2 比較指針:");
        System.out.println(s1 == s2 );
        System.out.print("s3 s4 比較指針:");
        System.out.println(s3 == s4 );

        System.out.print("s3 s4 比較內容:");
        System.out.println(s3.equals(s4));


        System.out.println("\n==============================================");


        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1.equals(p2)); // Object 原有的equals功能 跟 == 一樣
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        System.out.println(a1.equals(a2)); // Apple 的equals功能 被改寫了

        System.out.println("\n==============================================");

        // 重要概念 字串內容只要有任何改變 就是一個新的字串物件
        s2 = "Hello CHIYU";
        System.out.print("再比一次s1 s2 比較指針:");
        System.out.println(s1 == s2);

        // 回傳一個新的字串物件
        String s5 = s3.concat(" is Good");
        System.out.println(s5);
        // 原來的沒變
        System.out.println(s3);



        System.out.println("\n==============================================");
        // toString() 是很重要的功能

        //  x 的記憶體資料 就是值
        int x = 12;
        System.out.println(x);

        // Pen p1 的記憶體資料 就是指針
        System.out.println(p1);

        // Apple a1 的記憶體資料 是指針
        // 可是印出來的是...?
        // 看看裡面跟父類別的 toString()
        System.out.println(a1);

        // String 類別的 toString() 功能也被修改過了
        System.out.println(s1);
    }
}

class Apple {
    @Override
    public String toString() {
        return "ApplePen";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

class Pen {

}
