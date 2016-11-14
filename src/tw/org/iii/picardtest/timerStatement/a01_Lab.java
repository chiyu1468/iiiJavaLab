package tw.org.iii.picardtest.timerStatement;

import java.util.Timer;
import java.util.TimerTask;

public class a01_Lab {
    public static void main(String[] args){
        Timer t1 = new Timer();
        t1.schedule(new MyTask(), 3000, 1000);
        t1.schedule(new StopTimer(t1),10000);
        System.out.println("Waiting...");
    }
}


class MyTask extends TimerTask{
    int i;
    @Override
    public void run() {
        System.out.println(i++);
    }
}

class StopTimer extends TimerTask{
    private Timer t2;
    StopTimer(Timer t1){this.t2 = t1;}


    @Override
    public void run() {
        // 清除任務
        t2.purge();
        // 停止timer
        t2.cancel();

    }
}
