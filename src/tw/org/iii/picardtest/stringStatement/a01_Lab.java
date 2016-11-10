package tw.org.iii.picardtest.stringStatement;

// TODO --- 介紹 String 類別特性

public class a01_Lab {
    public static void main(String[] args) {
        byte[] b1 = {97,98,99,100};

        // 字串很特殊 它是 final 類別 => 絕子絕孫 沒有人能繼承
        // 以下是字串的生成:
        String s1 = new String();
        // 字串一定要用 兩個雙引號 " 夾住
        // 字串不用new就可以給值 ()
        String s2 = "CHIYU";
        // 運用不同的 Constructor
        String s3 = new String(b1);
        String s4 = new String(b1,0,2);

        System.out.print(s4);


    }
}
