package arrays.algorithm;
import java.util.Arrays;
import java.util.Random;
/*
����һ��������飨����
 Random��������nextInt()����
 */
//������鳤�ȡ�����Ԫ��
//ʹ��Random���Ķ���rand������nextInt()����
public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(10);

        int[] a =new int[randNum];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println("����a�ĳ��ȣ�"+randNum);
        System.out.println(Arrays.toString(a));
    }
}