package tw.org.iii.picardtest.forstatement;

public class a01_Lab {
    public static void main(String[] args) {
        int i = 1;
        for (text1(i);i<10;text1(2)) {
            System.out.println(i);
            switch (i) {
                case 0:case 1:case 2:case 3:
                    i += 1;
                    break;
                case 4:case 7:
                    i += 3;
                    break;
            }

        }




        // j 在for裡面宣告
        for (int j=0;j<5;j++) {
            System.out.println(j);
        }
        // 就只能在for裡面看的到j
        //System.out.println(j);

    }



    static void text1(int x) {
        if (x == 1)
            System.out.println("Start");
        else
            System.out.println("----");
    }

}
