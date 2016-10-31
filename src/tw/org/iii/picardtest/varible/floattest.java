package tw.org.iii.picardtest.varible;

/**
 * Created by mmm on 2016/10/31.
 */

public class floattest {
    public static void main(String[] args){
        float Var1 = 12;
        // java 看到小數點 就是要用 double
        // float Var2 = 0.1;
        float Var3 = 0.1f;
        double Var4 = 10.1;
        System.out.println(Var1);

        double Var5 = 10, Var6 = 3 , Var7 = 0;
        int Var0 = 0;
        System.out.println(Var5 / Var6);
        System.out.println(Var5 / Var0);
        System.out.println(Var7 / Var7);
        // 這行會GG
        // System.out.println(Var0 / Var0);




    }
}
