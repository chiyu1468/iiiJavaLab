package tw.org.iii.picardtest;


public class prime01 {
    static public void main(String[] args) {

        System.out.print("\t");

        int N = 100;
        for(int i=2;i<=N;i++) {

            // 判斷
            double a = Math.sqrt(i);
            boolean prime = true;
            for (int j = 2; j <= a; j++) {
                if (i % j == 0)
                    prime = false;
            }

            // 輸出
            if (prime == true)
                System.out.print(i + "\t");
            else
                System.out.print("\t");
            if (i%10 == 0) System.out.println();
        }
    }
}
