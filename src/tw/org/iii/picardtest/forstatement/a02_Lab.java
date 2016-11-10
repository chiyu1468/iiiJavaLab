package tw.org.iii.picardtest.forstatement;

public class a02_Lab {
    public static void main(String[] args) {

        int line = 4, initail = 2;

        int i,j,k;
        for (i=0;i<=2;i++) {
            for (j = 1; j <= 9; j++) {
                for (k = initail + i*line; k < initail + line + i*line; k++) {
                    int x = k * j;
                    System.out.print(k + " x " + j + " = " + x + "\t\t");
                }
                System.out.println();
            }
            System.out.println("---------------------------------------");
        }
    }



}
