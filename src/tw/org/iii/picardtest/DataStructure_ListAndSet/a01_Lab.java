package tw.org.iii.picardtest.DataStructure_ListAndSet;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class a01_Lab {
    public static void main(String[] agrs){
        // 用哪個 class 不重要  只是要用一個能建立物件實體的 class
        HashSet set = new HashSet();
        // 建立物件
        String name; name = "Chiyu";
        // 丟字串物件
        set.add(name);
        // auto BOX
        set.add(12);
        // 下面亂丟
        set.add("name");
        set.add(12);
        set.add("hello");

        // 輸出看看剛剛丟的東西變成怎樣
        // 看看有沒有順序性 跟 會不會重複
        System.out.println("HashSet : " + set);
        System.out.println("==============分隔線================");


        // 出樂透
        // TreeSet 本身就有順序性
        TreeSet set2 = new TreeSet();
        while (set2.size() <= 6 ){
            set2.add((int)(Math.random()*49+1));
        }
        System.out.println("TreeSet : " + set2);
//        System.out.println(set2.toString());
        System.out.println("==============分隔線================");

        LinkedList list = new LinkedList();
        list.add("Name");
        list.add(name);
        list.add(12);
        list.add(true);
        list.add(45.6);
        System.out.println("LinkedList : " + list.toString());
        System.out.println("==============分隔線================");

        LinkedList list2 = new LinkedList();
        list2.add(0,1);
        list2.add(0,2);
        list2.add(0,3);
        list2.add(0,4);
        list2.add(0,5);
        System.out.println(list2.toString());








    }
}
