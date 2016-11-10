package tw.org.iii.picardtest.ObjectOriented;


public class a02_Lab {
    public static void main(String[] args){
        Chiyu001 c1 = new Chiyu001();
        Chiyu001 c2 = new Chiyu001();
        System.out.println();
    }

}


class Chiyu001 {
    // Constructors(建構式) -- 被new出來的時候 會自動執行的"程式" 以後都不會被執行
    // 沒有回傳值 與 類別名稱一樣
    // 並不屬於"成員" 不會被繼承 (PHP的會繼承?)
    Chiyu001(){
        System.out.println("Hello~ chiyu");
    }

    void Info() {
        System.out.println("i'm chiyu");
    }

}
