package tw.org.iii.picardtest.stringStatement;


import javax.swing.*;

public class a04_GuessNumber {

    static String Answer;

    public static void main(String[] args) {
        // 1.產生謎底
        Answer = createAnwser();

        // 2. 開始猜
        boolean isWINNER = false;
        for(int i=0;i<3;i++){
        String guess = JOptionPane.showInputDialog("輸入:");
        String result = checkAB(Answer, guess);
        JOptionPane.showMessageDialog(null, result);
            if(result.equals("3A0B")) {
                isWINNER = true;
                break;
            }
        }

        // 3.
        if(isWINNER) {
            JOptionPane.showMessageDialog(null, "Right! You are winner!");
        } else {
            JOptionPane.showMessageDialog(null, "Loooooooser. Answer : " + Answer);
        }
    }

    static String createAnwser(){
        return "897";
    }

    static String checkAB(String answer, String guess){
//        return "3A0B";
        int A=0,B=0;
        for (int i=0; i<answer.length(); i++){
            // answer 的第i碼 == guess 的第i碼
            if(answer.charAt(i) == guess.charAt(i)){
                A++;
            // guess 的第i碼 是否有在 answer 裡面
            } else if (guess.indexOf(answer.charAt(i)) != -1){
                B++;
            }
        }
        return A + "A" + B + "B";
    }
}
