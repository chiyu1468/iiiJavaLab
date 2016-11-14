package tw.org.iii.picardtest.threadStatement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class a02_Racing extends JFrame{

    private JButton Go;
    private JLabel[] lanes = new JLabel[8];
    private WanWan[] Dogs = new WanWan[8];
    private int Rank = 1;


    public a02_Racing(){
        super("柴柴賽跑");

        // GridLayout            row,column
        setLayout(new GridLayout( 9,  1    ));
        // 出發按鈕
        Go = new JButton("Go!!!");
        add(Go);
        // 做出跑道
        for(int i=1;i<=lanes.length;i++){
            lanes[i-1] = new JLabel("第 " + i + " 跑道");
            add(lanes[i-1]);
        }

        Go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
                running();
            }
        });

        setSize(1000,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private class WanWan extends Thread{
        private byte LaneNo;
        WanWan(byte i){LaneNo =(byte)i;}

        @Override
        public void run() {
            for(int i=0;i<100;i++){
                lanes[LaneNo].setText(lanes[LaneNo].getText() + ">");

                if(i == 99){
//                    lanes[LaneNo].setText(lanes[LaneNo].getText() + ">" + Rank++);

                    lanes[LaneNo].setText(lanes[LaneNo].getText() + "> Winner!!");
                    StopDog();
                }

                try {
                    sleep(20 + (int)(Math.random()*200));
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }


    void running() {
        for (int i=0; i<Dogs.length;i++){
            Dogs[i] = new WanWan((byte) i);
        }
        for (WanWan dog : Dogs){
            dog.start();
        }
    }

    private void StopDog(){
        for (WanWan dog : Dogs){
            dog.interrupt();
        }
    }

    private void reset(){
        int i = 1;
        for(JLabel lane : lanes){
            lane.setText("第 " + i++ + " 跑道");
        }
    }

    public static void main(String[] args){
        new a02_Racing();
    }
}
