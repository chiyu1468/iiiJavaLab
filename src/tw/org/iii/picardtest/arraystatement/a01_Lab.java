package tw.org.iii.picardtest.arraystatement;

/**
 * Array 矩陣
 * 1. 型別 => 固定
 * 2. 長度 => 初始化 => 固定
 *
 *
 */
public class a01_Lab {
    public static void main(String[] args) {
        int[] Array1;
        int Array2[];

        // java 的陣列 是一種物件
        Array1 = new int[3];
        // 這個物件 有 length 屬性
        System.out.println(Array1.length);
        // 物件被new出來的時候 就會被初始化 不用給 裡面就都有值了
        System.out.println(Array1[2]);


        Array1[0] = 1;Array1[1] = 2;Array1[2] = 3;

        // java 的 foreach 功能
        for ( int value1 : Array1) {
            System.out.println(value1);
        }

    }
}
