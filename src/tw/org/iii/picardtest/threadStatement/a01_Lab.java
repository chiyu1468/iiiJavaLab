package tw.org.iii.picardtest.threadStatement;


public class a01_Lab {
    public static void main(String[] agrs){
        MyThread mt1 = new MyThread("A",200);
        MyThread mt2 = new MyThread("B",300);

        // 很一般的呼叫方法
        mt1.run(); mt2.run();mt2.run();
        System.out.println("========我是分隔線=========");

        // 不一般的執行序
        mt1.start();mt2.start();//mt2.start();
        System.out.println("========我是分隔線========= <-- 你確定嗎? 哈哈");

        // 把非執行緒 轉換成 執行緒
        MyThreadable mr1 = new MyThreadable("C",400);
        Thread t1 = new Thread(mr1);
        t1.start();


        System.out.println("Ya~ main Ending!");

    }
}

// 這是一個執行緒
// 但是它已經不能繼承其他的 class 為父類別
class MyThread extends Thread{
    private String name;
    private long delay;
    MyThread (String name,int delay){this.name = name;this.delay = (long)delay;}

    @Override
    public void run() {
        super.run();
        System.out.println("我是一顆口艾小炸彈~~~");
        for(int i = 5; i>0;i--){
            System.out.println(name + " : 離爆炸還有 " + i + " 秒");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " : Bomb!!!");
    }
}


// 它不是執行緒喔～～～
// 有其他延伸的空間
// 但是可以把它變成有"執行緒"功能
class MyThreadable implements Runnable{
    private String name;
    private long delay;
    MyThreadable (String name,int delay){this.name = name;this.delay = (long)delay;}

    @Override
    public void run() {
        System.out.println("我是一顆口艾小炸彈~~~");
        for(int i = 5; i>0;i--){
            System.out.println(name + " : 離爆炸還有 " + i + " 秒");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " : Bomb!!!");
    }
}
