package tw.org.iii.picardtest.varible;

public class varibletest {
    public static void main(String[] Variabletest1) {

        // integer : byte[8]255 , short[16]65535 , int[32] , long[64]
        // 變數名稱命名規定 : [a-zA-Z$_][a-zA-Z0-9$_]*
        byte ___ = 1;
        System.out.println(___);
        // JAVA 支援 Unicode
        short 我是中文 = 33;
        System.out.println(我是中文);

        byte Var1 = 127;
        Var1 += 1;
        System.out.println(Var1);

        // byte, short , int 運算功能  回傳一定是 int
        byte Var2 = 1;
        byte Var3 = 3;
        // 回傳 int 所以 下面這行會GG
        // byte sum = Var2 + Var3;
        int sum = Var2 + Var3;

        // 十六進位
        int Var4 = 0x12;
        // 八進位
        int Var5 = 012;
        System.out.println(Var4);
        System.out.println(Var5);

    }

}
