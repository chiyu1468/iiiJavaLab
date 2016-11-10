package tw.org.iii.picardtest.ObjectOriented;

// 土豆選完 IDE 會自己帶出來
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// 土豆用選的 ( JFrame(javax.swing) )
public class a04_Lab extends JFrame{

    private JButton Bopen, Bexit;

    // Constructors
    public a04_Lab (){
        setSize(480,640);
        setTitle("ChuChu");

        setLayout(new FlowLayout());

        JButton Bsave = new JButton("Save");
        Bopen = new JButton("Open");
        Bexit = new JButton("Exit");

        add(Bopen); add(Bexit); add(Bsave);

        Bexit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }



    // 程式進入點
    public static void main(String[] args){
        // new 出一個 a04_Lab 物件實體
        new a04_Lab();
    }
}
