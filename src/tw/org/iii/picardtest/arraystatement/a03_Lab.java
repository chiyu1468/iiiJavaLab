package tw.org.iii.picardtest.arraystatement;

public class a03_Lab {
    public static void main(String[] args) {
        int[][] Array1;
        Array1 = new int[3][4];
        for (int i = 0; i<Array1.length; i++) {
            for (int j = 0; j<Array1[i].length;j++) {
                System.out.print(Array1[i][j] + "|");
            }
            System.out.println("");
        }





    }
}
