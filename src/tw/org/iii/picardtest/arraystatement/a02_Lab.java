package tw.org.iii.picardtest.arraystatement;

public class a02_Lab {
    public static void main(String[] args) {
//        NoArray();
        UseArray();
    }

    static void UseArray() {
        int[] p = new int[6];
        for (int i=0; i<100; i++) {
            int point = (int) (Math.random()*6)+1;
            p[point]++;
        }
        for (int times : p) {
            System.out.println(times);
        }
    }


    static void NoArray(){
        int one=0,two=0,three=0,four=0,five=0,six=0;

        for (int i=0;i<100;i++){

            switch (((int)(Math.random() * 6))+1) {
                case 1:
                    one +=1;
                    break;
                case 2:
                    two +=1;
                    break;
                case 3:
                    three += 1;
                    break;
                case 4:
                    four += 1;
                    break;
                case 5:
                    five ++;
                    break;
                case 6:
                    six ++;
                    break;
            }
        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);

    }
}


