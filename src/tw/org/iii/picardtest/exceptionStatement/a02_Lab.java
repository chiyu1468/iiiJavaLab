package tw.org.iii.picardtest.exceptionStatement;


public class a02_Lab {
    public static void main(String[] agrs) {
        VeryBird b1 = new VeryBird();

        // 因為這個方法 可能會有 Exception 所以不給你編譯
        try {
            b1.setLimb(2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

class VeryBird {
    private int Limb;

    // 如果這個方法 會拋出 Exception 必須對外宣告
    // (包裝盒要寫使用的注意事項啦~~~)
    void setLimb(int n) throws Exception{
        if(n<0 || n>2){
            throw new Exception();
        }
        Limb = n;
    }


    // 如果這個方法 會拋出 RuntimeException
    // 就可以讓使用者去處理
    void Sing(String s) {
        if (s.length()==0){
            throw  new RuntimeException(s);
        }
        System.out.println();
    }




}
