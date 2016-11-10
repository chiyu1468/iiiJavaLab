package tw.org.iii.picardtest.arraystatement;

/**
 * Created by mmm on 2016/11/1.
 */
public class a04_Lab {
    public static void main(String[] args) {
        int[][] Array1 = new int[3][];
        // 因為樹狀架構 不能沒有根 所以下層陣列不能先宣告
        // int[][] Array2 = new int[][4];

        Array1[0] = new int[3];
        Array1[1] = new int[4];
        Array1[2] = new int[6];


        for (int[] v : Array1){
            for (int x : v ) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // 合法陣列宣告
        int[] Array3 = new int[]{1,2,3,4,5};
        int[] Array4 = {1,2,3,4,5};
        int[] Array5;
        Array5 = new int[]{1,2,3,4,5};

        // 以下為非法宣告
        //int[] Error1;
        //Error1 = {1,2,3,4,5}

    }
}
