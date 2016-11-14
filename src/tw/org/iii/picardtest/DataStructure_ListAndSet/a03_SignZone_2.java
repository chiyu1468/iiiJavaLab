package tw.org.iii.picardtest.DataStructure_ListAndSet;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;


    public class a03_SignZone_2 extends JPanel{

        // 很多條線 ---------> 一條線 ---> 很多點
        private LinkedList<LinkedList<HashMap<String, Integer>>> lines = new LinkedList<>();

        private LinkedList<LinkedList<HashMap<String, Integer>>> tmplines = new LinkedList<>();

        public a03_SignZone_2() {
            System.out.println("SignZone");

            MyMouseLister myMouseRun = new MyMouseLister();
            addMouseMotionListener(myMouseRun);
            addMouseListener(myMouseRun);
        }

        // 類別裡面的類別
        // 內部類別可以存取 原類別的東西
        private class MyMouseLister extends MouseAdapter{
            @Override
            public void mousePressed(MouseEvent e) {
                // super.mousePressed(e); // 因為知道裡面是空的 所以可以拿掉 哈哈
                // 按下去 產生一條線的頭
                LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
                //HashMap<String, Integer> point = new HashMap<>();
                //int X = e.getX(), Y = e.getY();
                //point.put("x", X); point.put("y", Y);
                lines.add(line);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int X = e.getX(), Y = e.getY();
                //System.out.println("(" + X + "," + Y + ")"); // debug use
                HashMap<String, Integer> point = new HashMap<>();
                point.put("x", X);
                point.put("y", Y);
                // 把抓到的點 放到最新的"那一條線"
                lines.getLast().add(point);
                repaint();


                // 清掉redo 的東西
                tmplines.clear();
            }
        }


        void clear() {
            tmplines = lines;
            lines.clear();
            repaint();
        }

        void undo() {
            if(lines.size() > 0){
                tmplines.push(lines.pollLast());
                repaint();
            }
        }

        void redo() {
            if(tmplines.size() > 0) {
                lines.add(tmplines.pollFirst());

            } else if(lines.size() == 0){
                lines = tmplines;
                tmplines.clear();
            }
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D)g;
            setBackground(Color.BLACK);
            g2d.setColor(Color.YELLOW);
            g2d.setStroke(new BasicStroke(3));

            // 畫很多條線
            for(LinkedList<HashMap<String, Integer>> Dline : lines){
                // 畫一條線
                for (int i = 1; i < Dline.size(); i++) {
                    HashMap<String, Integer> p0 = Dline.get(i - 1);
                    HashMap<String, Integer> p1 = Dline.get(i);
                    g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
                }
            }
        }
    }

