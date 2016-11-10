package tw.org.iii.picardtest.ifstatement;

/**
 * Created by mmm on 2016/10/31.
 */
public class a03_switch {
    public static void main(String[] args) {
        // byte short int char
        // v1.7 之後 支援 字串&列舉
        // long float double 不吃
        byte month = 2;
        final int b = 98;
        int year = 1600;

        // 1752 . 09 只有14天



        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("31");
                break;
            case 4:case 6:case 9:case 11:
                System.out.println("30");
                break;
            case 2:
                if(year % 4 == 0) {
                    if(year % 100 == 0) {
                        System.out.println("29");
                    } else {
                        if(year % 400 == 0){
                            System.out.println("28");
                        } else {
                            System.out.println("29");
                        }
                    }
                } else {
                    System.out.println("28");
                }
                break;
        }


        byte monthA = 100;
        // 垃圾寫法 以狀況寫case
        switch (monthA) {
            case 1:
                System.out.println("A31");
                break;
            case 2:
                System.out.println("A28");
                break;
            case 3:
                System.out.println("A31");
                break;
            case 4:
                System.out.println("A30");
                break;
            case 5:
                System.out.println("A31");
                break;
            case 6:
                System.out.println("A30");
                break;
            case 7:
                System.out.println("A31");
                break;
            case 8:
                System.out.println("A31");
                break;
            case 9:
                System.out.println("A30");
                break;
            case 10:
                System.out.println("A31");
                break;
            case 11:
                System.out.println("A30");
                break;
            case 12:
                System.out.println("A31");
                break;
            case b + 2:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }


    }
}
