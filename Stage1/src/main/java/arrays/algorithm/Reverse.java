package arrays.algorithm;
/*
�з�i
��ͷ��i���λ���
 */
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9};
        // 9 8 7 6 5 4 3 2 1
        // ����ż����������
        for (int i = 0; i <a.length/2 ; i++) {
            int tmp= a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] =tmp;
        }

        System.out.println(Arrays.toString(a));
    }
}