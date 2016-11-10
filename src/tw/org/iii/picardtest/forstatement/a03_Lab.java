package tw.org.iii.picardtest.forstatement;

public class a03_Lab {
    public static void main(String[] args) {
        int N = 100, sum = 0;
        for (int i = 0; i < N ; i++) {
            sum += i;
        }
        System.out.println("1 + 2 + ... + " + N + " = " + sum);
    }
}
