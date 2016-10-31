package tw.org.iii.picardtest.ifstatement;

import javax.swing.*;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mmm on 2016/10/31.
 */
public class a01_LAB {
    public static void main(String[] args) {
        // 亂數
//        double Var1 = Math.random() * 101;
//        int Score = (int)Math.round( Var1 + 0 );

        // 命令列輸入
//        System.out.println("Enter Score:");
//        Scanner myScan = new Scanner(System.in);
//        int Score = myScan.nextInt();

        // 視窗輸入
        String strScore = JOptionPane.showInputDialog("Enter Score:");
        int Score = Integer.parseInt(strScore);
        JOptionPane.showMessageDialog(null,Score);



        System.out.println(Score);
        if(Score > 90) {
            System.out.println("A");
        }
        if(Score > 80 && Score <=90) {
            System.out.println("B");
        }
        if(Score > 70 && Score <=80) {
            System.out.println("C");
        }
        if(Score > 60 && Score <=70) {
            System.out.println("D");
        }
        if(Score <= 60) {
            System.out.println("E");
        }


    }
}
