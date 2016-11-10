/** Java Doc
 *  用來產生文件檔用的
 * Created by mmm on 2016/10/31.
 */

// 這是單列註解

/*
這是區塊註解
 */

package tw.org.iii.picardtest;




public class Hello2 {

    static String[] week = {"Sunday\t\t", "MonthDay\t", "Tuesday\t\t", "Wednesday\t", "Thursday\t", "Friday\t\t", " Saturday\t"};

    public static void main(String[] Chiyu) {

        int year = 1970, month = 1, day = 1;
        int weekday = 4; // 1970.01.01 thursday

        // 抓取現在時間
        long passSec = System.currentTimeMillis();


//        // 設定時間
//        Calendar mydate = new Calendar.getInstance();
//        mydate.set(2016,06,01);
//        long x = mydate.getTimeInMillis();
//        System.out.println(x);

        int passDays = (int)(passSec / 1000 / 60 / 60 / 24);

        // 幾天前
        int offSet = 17108;
        passDays = passDays - offSet;


        if(passDays >=0){
            int passMonth = 1;
            // 1970.01.01 是第一天 不是第零天 所以要加一
            day = passDays + 1;

            // 計算經過的月份 與 天數
            for(;day > monthDay(year+(passMonth/12),(passMonth%12));passMonth++){
                day = day - monthDay(year+(passMonth/12),(passMonth%12));
            }
            year = year+(passMonth/12);
            month = (passMonth%12);

            // 計算星期
    //        String x = week[(weekday + passDays)%7];
    //        System.out.println(x);
            // 顯示
            myCalendar(year,month,day,(weekday + passDays)%7);
        } else {
            System.out.println("超出範圍測試中!!!");
        }


    }

    static int monthDay(int year, int month) {
        int num = 0;
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:case 0:
                num = 31;
                //System.out.println("31");
                break;
            case 4:case 6:case 9:case 11:
                num = 30;
                //System.out.println("30");
                break;
            case 2:
                // 四年一潤百年要潤四百不潤
                if((year%400 == 0) || ((year%4 == 0) && !(year%100 == 0))) {
                    num = 29;
                } else {
                    num = 28;
                }
                break;
        }
        // 英美曆法
        if(year == 1752 && month == 9) {
            num = 19;
        }
        return num;
    }

    static void myCalendar(int year, int month, int day, int weekday) {

        System.out.println("今天是 " + year + " 年/ " + month + " 月");

        for (String ctitle : week)
            System.out.print(ctitle);
        System.out.println("\n----------------------------------------------------------------------------------");

        // 用現在的日期星期 計算一號的星期
        int firstWeekDay = day%7;
        if(firstWeekDay>weekday)
            firstWeekDay = weekday - (firstWeekDay-1) + 7;
        else
            firstWeekDay = weekday - (firstWeekDay-1);

        //
        int N = firstWeekDay + monthDay(year,month);
        int a = 1 - firstWeekDay;
        for(int i = 1; i <= N;i++) {
            if(a>0) {
                if(a==day)
                    System.out.print(a + "(＊)\t\t");
                else
                    System.out.print(a + "\t\t\t");
            }
            else
                System.out.print("\t\t\t");
            if(i%7 == 0)
                System.out.println();
            a++;
        }





    }

}




