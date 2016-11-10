package tw.org.iii.picardtest.ObjectOriented;


public class a03_exe {
    public static void main(String[] args){
        a03_Scooter s1 = new a03_Scooter();
        System.out.println("-------------");

        a03_NotScooter s2 = new a03_NotScooter();
        System.out.println(s2.weight);
        System.out.println("-------------");

        a03_OldScooter s3 = new a03_OldScooter();


    }
}
