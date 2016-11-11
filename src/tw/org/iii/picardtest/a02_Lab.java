package tw.org.iii.picardtest;


import java.util.HashMap;
import java.util.TreeSet;

public class a02_Lab {
    public static void main(String[] ag) {
        // 用泛型指定內容物
        TreeSet<Integer> set = new TreeSet();
        set.add(12);
        // 上面已經指定 是Integer 所以裡面不能裝 String
        // set.add("CHIYU");
        System.out.println("========分隔線=========");

        // 這邊的map是指 mapping 不是地圖
        // 關聯式陣列
        HashMap<String,Object> map = new HashMap<>();
        map.put("key","value");
        map.put("name","Chiyu");
        map.put("gender",true);
        map.put("age",65);

        System.out.println(map.get("name"));


    }
}
