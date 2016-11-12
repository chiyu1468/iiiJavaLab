package tw.org.iii.picardtest.DataStructure_ListAndSet;


import javax.swing.*;
import java.awt.*;

public class a03_Printer extends JFrame{
    private JButton Bclear,Bundo,Bredo;
    private a03_SignZone sz;

    public a03_Printer(){
        super("YY簽名版");

        // 上方功能列
        setLayout(new BorderLayout());
        JPanel top = new JPanel(new FlowLayout());
        Bclear = new JButton("Clear");
        Bredo = new JButton("Redo");
        Bundo = new JButton("Undo");
        top.add(Bclear);top.add(Bredo);top.add(Bundo);
        add(top, BorderLayout.NORTH);

        // 中間的畫布
        sz = new a03_SignZone();
        add(sz, BorderLayout.CENTER);


        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }










    public static void main(String[] ar){
        new a03_Printer();
    }
}
