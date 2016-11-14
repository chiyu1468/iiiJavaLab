package tw.org.iii.picardtest.DataStructure_ListAndSet;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class a03_Printer extends JFrame{
    private JButton Bclear,Bundo,Bredo;
    private a03_SignZone sz;
    private a03_SignZone_2 sz2;

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
        // 第一版的
//        sz = new a03_SignZone();
//        add(sz, BorderLayout.CENTER);
        // 第二版的
        sz2 = new a03_SignZone_2();
        add(sz2, BorderLayout.CENTER);


        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //=============動作================
        Bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sz2.clear();
            }
        });

        Bundo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sz2.undo();
            }
        });


        Bredo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sz2.redo();
            }
        });


    }




    public static void main(String[] ar){
        new a03_Printer();
    }
}
