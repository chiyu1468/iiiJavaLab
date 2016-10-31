package tw.org.iii.picardtest.ifstatement;

public class a02_Lab {
    public static void main(String[] args){
        int a = 10, b = 3;

        // ++ 在後面 所以先做 a <= 10 才做 a++
//        if (a++ <= 10 && b-- >= 3) {
        // ++a <= 10 判斷 false 就不會執行 b-- >= 3
//        if (++a <= 10 && b-- >= 3) {
        // 一個 & 是 binary AND 運算
        if (++a <= 10 & b-- >= 3) {
            System.out.println("OK; a = " + a + ", b = " + b);
        } else {
            System.out.println("NO; a = " + a + ", b = " + b);
        }



    }
}
