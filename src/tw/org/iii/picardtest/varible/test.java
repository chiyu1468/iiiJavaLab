package tw.org.iii.picardtest.varible;

public class test {
    public static void main(String[] agrs){
        Chiyu491.m1(4);
        System.out.println("===============");
        Chiyu491.m1(1);
    }
}


class Chiyu491{

    static void m1(int i){
        try {
            int[] a = {1,2,3};
            System.out.println(a[i]);
            return;
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Done!");
    }
}