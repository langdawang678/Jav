package arrays.algorithm;

import java.util.Arrays;

public class PokerDisorder {
    //生成有序扑克牌
    public static void main(String[] args) {
        int[] cards =new int[54];
        for (int i = 0; i < cards.length; i++) {
            cards[i] =i+1;
        }
        System.out.println(Arrays.toString(cards));

        //洗牌：产生一个随机数index去和cards[0]交换，然后for循环随机length次
        for (int i = 0; i < cards.length; i++) {
            double rand = Math.random();//Math.random():产生一个[0，1)之间的随机数
            int index = (int)(rand*(cards.length));//！此处的int要加括号，实现数据类型转换
            int tmp = cards[0];
            cards[0] =cards[index];
            cards[index] = tmp;
        }
        System.out.println(Arrays.toString(cards));
    }
}