package arrays.algorithm;
import java.util.Arrays;
/*
ȷ����Ҫɾ��������del
�ҳ�����index
��Ҫɾ���Ľ��������
Ȼ����һ���µ����鵽�����ڶ�
 */
public class ElementDelete {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 99, 5, 6, 100};
        int del = 99;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == del) {
                index = i;
            }
        }
        System.out.println("Ҫɾ�������ֵ�������"+index);

        int tmp =a[a.length-1];
        a[a.length-1]=a[index];
        a[index]=tmp;
        System.out.println(Arrays.toString(a));

        int[]b= new int[a.length-1];
        System.arraycopy(a,0,b,0,a.length-1);
        System.out.println(Arrays.toString(b));
    }
}