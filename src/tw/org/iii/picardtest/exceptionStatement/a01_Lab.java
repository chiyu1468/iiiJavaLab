package tw.org.iii.picardtest.exceptionStatement;

// TODO --- RunTime Exception (執行時期的例外或異常) 重要!!!
/* 不像 C 語言 任何異常 都是直接由系統(OS) 跳出
 * Java 是在 JVM 上面跑，任何異常是由 JVM 傳回來
 * 所以我們可以用程式處理 不會被系統中斷掉整個程式
 *
 * ============================================
 * Exception
 *      -- RuntimeException 有問題 編譯會過 但是"後果自己處理"
 *         一個可以出廠後 客戶自己負責的概念 可以不用加 try catch
 *          -- ArithmeticException
 *          -- IndexOutOfBoundsException
 *              -- ArrayIndexOutOfBoundsException
 *      -- 其他所有的 SubClass　就是事先檢查的例外
 *      　　都要改好 或加上 try catch
 *         一個產品一定要 QC 後 才會出廠的概念
 *         請看 a02_Lab
 */



public class a01_Lab {
    public static void main(String[] args){
        int a = 10, b = 0;
        int[] d = {0,1,2,3};

        // 嘗試執行 try 裡面的程式
        try {
            System.out.println("ABC");
            System.out.println(d[4]);
            int c = a/b;
            System.out.println("DEF");
        // 像棒球一樣
        // 看有沒有接到 Exception 物件
        // 有接到球 就用以下程式做處理
        }catch (ArithmeticException myExc){
            System.out.println("除以零");
        // 可以 catch 不同的例外
        }catch (ArrayIndexOutOfBoundsException myExc){
            System.out.println("超出陣列");
        }



    }
}
