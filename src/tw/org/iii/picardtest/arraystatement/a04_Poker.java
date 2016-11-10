package tw.org.iii.picardtest.arraystatement;

import java.util.ArrayList;
import java.util.Arrays;



public class a04_Poker {

    public static void main(String[] args){

        long startTime = System.currentTimeMillis();
        // 洗牌
        int[] poker = Shuffle2(52);

        long time = System.currentTimeMillis() - startTime;
//        System.out.println("---------------");
//        System.out.println(time);

        // 發牌
        int[][] players = new int[4][13];
        for(int i=0; i<poker.length; i++){
            players[i%4][i/4] = poker[i];
        }

        // 攤牌
        for (int[] player : players){
            //
            Arrays.sort(player);
            for (int card : player){
                GetArg(card);
                //System.out.print(card + " ");
            }
            System.out.println("\n ------------------------");
        }
    }



    // 亂序產生
    static int[] Shuffle1(int N) {

        int[] poker = new int[N];

        for(int i=0; i<poker.length;){
            boolean isRepeat = false;
            int temp = (int)(Math.random()*poker.length);

            for(int j = 0; j<i; j++) {
                if (poker[j] == temp) {
                    isRepeat = true;
                }
            }
            if(!isRepeat) {
                poker[i] = temp;
//                System.out.println(poker[i] + "\t");
                i++;
            }
        }
        return poker;
    }

    // 抽插弄亂
    static int[] Shuffle2(int N) {
        int[] poker = new int[N];

        for(int i = 0; i<poker.length; i++){
            poker[i] = i;
        }
        for(int i = 0; i<poker.length; i++){
            int rnum= (int)(Math.random()*poker.length);
            int temp = poker[rnum];
            poker[rnum] = poker[i];
            poker[i] = temp;
        }
        return poker;
    }

    // API
    static int[] Shuffle3(int N) {

        int[] poker = new int[N];

        ArrayList<Integer> deck = new ArrayList<Integer>();
        for(int i = 0; i<poker.length; i++){
            deck.add(i);
        }


        for(int v : deck) {
            System.out.println(v);
        }

//        System.exit(1);

        return poker;
    }

    static void GetArg(int card){
        String[] suits = {"黑桃 ","紅心 ","方塊 ","梅花 "};
        String[] face = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "};
        System.out.print(suits[card/13] + face[card%13] + "\t");
    }
}
