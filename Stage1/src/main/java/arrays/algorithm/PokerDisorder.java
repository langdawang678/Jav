package arrays.algorithm;

import java.util.Arrays;

public class PokerDisorder {
    //���������˿���
    public static void main(String[] args) {
        int[] cards =new int[54];
        for (int i = 0; i < cards.length; i++) {
            cards[i] =i+1;
        }
        System.out.println(Arrays.toString(cards));

        //ϴ�ƣ�����һ�������indexȥ��cards[0]������Ȼ��forѭ�����length��
        for (int i = 0; i < cards.length; i++) {
            double rand = Math.random();//Math.random():����һ��[0��1)֮��������
            int index = (int)(rand*(cards.length));//���˴���intҪ�����ţ�ʵ����������ת��
            int tmp = cards[0];
            cards[0] =cards[index];
            cards[index] = tmp;
        }
        System.out.println(Arrays.toString(cards));
    }
}