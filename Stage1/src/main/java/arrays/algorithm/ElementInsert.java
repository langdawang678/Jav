package arrays.algorithm;
import java.util.Arrays;
public class ElementInsert {
    public static void main(String[] args) {

        //1.ȷ��Ҫ��������飨�½�һ��length+1�ģ�
        int[] a ={1,2,3,4,5,6,7};
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));

        //2.ȷ��Ҫ�����λ�ú�����
        int index =4;
        int data =99;

        //3.�ƶ����ݣ������ڶ�������+1����������������+1��ֱ������index��
        for (int i = b.length-1; i >index; i--) {
            b[i] =b[i-1];
        }

        //4.��ֵ����������ݣ���ӡ
        b[index] =99;
        System.out.println(Arrays.toString(b));
    }
}