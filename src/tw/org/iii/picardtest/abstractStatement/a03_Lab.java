package tw.org.iii.picardtest.abstractStatement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

// TODO --- 複習視窗程式 Object Oriented a04_Lab 的延伸
//
public class a03_Lab extends JFrame implements ActionListener{

    // 先列出要用的家具清單
    private JTextArea editor;
    private JButton newFile,openFile,saveFile,saveAsFile,exit;


    // Constructor
    public a03_Lab(){
        // super();
        super("CHIYU的視窗");

        // 找一個擁有 setLayout 所需介面的 物件實體
        // 找到設計師 (設計整個房屋)
        BorderLayout myDesigner = new BorderLayout();
        setLayout(myDesigner);
        // setLayout(new BorderLayout()); // 快速寫法


        // 買家具
        newFile = new JButton("New");
        openFile = new JButton("Open");
        saveFile = new JButton("Save");
        saveAsFile = new JButton("Save As...");
        exit = new JButton("Exit");
        JButton SayHello = new JButton("Say Hello");

        editor = new JTextArea();

        // 找一個隔間設計師
        FlowLayout northDesigner = new FlowLayout();
        // 把 top 這個房間交給 這個設計師
        JPanel top = new JPanel(northDesigner);
        //JPanel top = new JPanel(new FlowLayout()); // 快速寫法
        // 把一些家具 丟進 top 房間 (設計師自己會安排好)
        top.add(newFile);top.add(openFile);top.add(saveFile);top.add(saveAsFile);top.add(exit);top.add(SayHello);

        //
        //add(top,BorderLayout.NORTH);
        add(top,myDesigner.NORTH);
        add(editor,myDesigner.CENTER);

        // 用 JScrollPane 做出卷軸



        // 事件
        // 第一招:創造一個新的class 去認證這個規格 (通常重視擴充性)
        SayHello.addActionListener(new MyListener());
        // 第二招:自己去認證這個規格 (引用的 interface 很小 又要多次引用時)
        exit.addActionListener(this);
        // 第三招:當場把半成品捏成可以用的class (重視程式可讀 與 維護性)
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("newFile!!!");
                newFile();
            }
        });
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
        saveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
        saveAsFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAsFile();
            }
        });



        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // 程式進入點
    public static void main(String[] agrs){
        new a03_Lab();
    }

    // ActionListener 的介面
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Exit Here!");
    }

    class MyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Check!");
        }
    }


    // 檔案指向
    private File currEditFile;

    // 產生新檔
    private void newFile() {
        currEditFile = null;
        editor.setText("");
    }

    // 開啟檔案
    private void openFile(){
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            currEditFile = jfc.getSelectedFile();
            System.out.println(currEditFile.getAbsolutePath());
            loadFile();
        }
    }

    // 開啟後的讀取檔案
    private void loadFile(){
        try {
            StringBuffer sdb = new StringBuffer();
            BufferedReader br = new BufferedReader(new FileReader(currEditFile));
            String line;
            while ( (line = br.readLine()) != null ){
                sdb.append(line + "\n");
            }
            br.close();
            editor.setText(sdb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 儲存檔案
    private void saveFile(){
        try {
            if(currEditFile != null){
                BufferedWriter bw = new BufferedWriter(new FileWriter(currEditFile));
                bw.write(editor.getText());
                bw.flush();
                bw.close();
            } else {
                saveAsFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 另存新檔 (設定指向)
    private void saveAsFile() {
        JFileChooser jfc = new JFileChooser();
        if(jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
            currEditFile = jfc.getSelectedFile();
            saveFile();
        }
    }


}


