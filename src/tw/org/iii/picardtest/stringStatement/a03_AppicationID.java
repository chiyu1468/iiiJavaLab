package tw.org.iii.picardtest.stringStatement;


public class a03_AppicationID {

    private String id;
    // 原本在 isCheckOK 方法裡面，從裡面拿出來 讓其他方法也可以用
    // static 讓這個字串 變成"類別級"的屬性 所以就算沒有物件產生 也可以使用
    // private 不讓外面看到這個字串
    // final 為了避免其他的方法不小心改到 讓它絕子絕孫
    static private final String LeadingLetter = "ABCDEFGHJKLMNPQRSTUVXYWZIO";


    // TODO --- 重要 Constructor 的 OverLoad 概念
    // =========== 自動身分證字號產生器 ==================
    // 參數最多的先做好
    public a03_AppicationID(boolean gender, char area) {
        id = "" + area;
        id += gender?"1":"2";
        for(int i = 3; i <= 9; i++){
            id += (int)(Math.random()*10);
        }
        for(int i = 0;i<10;i++){
            if(isCheckOK(id + i)){
                id = id + i;
                break;
            }
        }
    }

    // 呼叫 "自己" 上面那個的建構式
    public a03_AppicationID(char area) {
        this(((int)(Math.random()*2)==0?true:false),area);
    }

    public a03_AppicationID(boolean gender) {
        this(gender,LeadingLetter.charAt((int)(Math.random()*26)));
    }

    public a03_AppicationID() {
        this(((int)(Math.random()*2)==0?true:false),LeadingLetter.charAt((int)(Math.random()*26)));
    }


    // =======================================================
    public a03_AppicationID(String id){
        this.id = id;
    }

    // ==========================================

    public String getArea(){
        // get Area
        // String LeadingLetter = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
        String[] location = {"臺北市","臺中市","基隆市","臺南市","高雄市","新北市","宜蘭縣","桃園市","新竹縣","苗栗縣","臺中縣","南投縣","彰化縣","雲林縣","嘉義縣","臺南縣","高雄縣","屏東縣","花蓮縣","臺東縣","澎湖縣","陽明山管理局","金門縣","連江縣","嘉義市","新竹市"};
        return location[LeadingLetter.indexOf(this.id.charAt(0))];
    }


    public String getGender(){
        // Gender
        String x = "Female";
        if(this.id.charAt(1)=='1')
            x = "Male";
        return x;
    }

    public String getId() {
        return this.id;
    }


    static boolean isCheckOK(String id){
        boolean result = false;
        // 因為其他功能要用 拿到外面
        // String LeadingLetter = "ABCDEFGHJKLMNPQRSTUVXYWZIO";

        if(result = id.matches("^[A-Z][12][0-9]{8}$")){
            // 編碼規則
            int[] Array2 = {1,9,8,7,6,5,4,3,2,1,1};
            int[] Array1 = new int[11];
            char c = id.charAt(0);
            int count = 10 + LeadingLetter.indexOf(c);

            Array1[0] = count/10;
            Array1[1] = count%10;
            for(int i = 2; i<=10; i++)
                Array1[i] = Integer.parseInt(id.substring(i-1,i));

            // 計算
            int Sum = 0;
            for(int i = 0; i<=10; i++)
                Sum += Array1[i]*Array2[i];
//            System.out.println(Sum);
            result =(Sum % 10 == 0);
        }
        return result;
    }

    public boolean isCheckOK(){
        return isCheckOK(this.id);
    }

}
