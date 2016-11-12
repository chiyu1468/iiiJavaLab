package tw.org.iii.picardtest.DataStructure_ListAndSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

// 1. 因為我們要把畫圖區塊 加到 JFrame 裡面 所以要找一個 JFrame 認識的傢伙繼承
// 2. 想想有哪些功能需要 Override
public class a03_SignZone extends JPanel implements MouseMotionListener{

    // 運用泛型幫助我們定義
    private LinkedList<HashMap<String,Integer>> line = new LinkedList<>();

    public a03_SignZone(){
        System.out.println("SignZone");
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int X = e.getX(), Y = e.getY();
        System.out.println("(" + X + "," + Y + ")"); // debug use
        HashMap<String,Integer> point = new HashMap<>();
        point.put("x",X);point.put("y",Y);
        line.add(point);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {} // Do Nothing


    static int peack;
    // 跟 canvas 很像
    // 新一代的
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        peack++; System.out.println("paintComponent( " + peack + " )");

        // Graphics 在 java.awt 很基礎陽春的畫布工具
        // Graphics2D 比較好
        // 把傳統工具 換成 更好的工具 原因要找一下API 看歷史
        Graphics2D g2d = (Graphics2D)g;
        // 背景顏色
        setBackground(Color.BLACK);
        // 畫筆顏色
        g2d.setColor(Color.RED);
        // 粗細
        g2d.setStroke(new BasicStroke(2));
        // 畫圓
        g2d.drawOval(100,100,6,6);
        g2d.fillOval(100,200,6,6);
        // 畫線
        g2d.setColor(Color.YELLOW);
        g2d.drawLine(0,0,3,3);

        // 三個點要兩個線段  五個點要四個線段 ... 依此類推
        for(int i=1; i<line.size();i++){
            HashMap<String,Integer> p0 = line.get(i-1);
            HashMap<String,Integer> p1 = line.get(i);
            g2d.drawLine(p0.get("x"),p0.get("y"),p1.get("x"),p1.get("y"));
        }



    }




    // 舊版的畫布
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        System.out.println("paint");
//        Graphics2D g2d = (Graphics2D)g;
//
//        // 顏色
//        g2d.setColor(Color.BLUE);
//        // 粗細
//        g2d.setStroke(new BasicStroke(2));
//        // 畫圓
//        g2d.drawOval(200,200,5,5);
//    }


}
