package arrays.algorithm;
import java.util.Arrays;
/*
确定需要删除的数据del
找出它的index
把要删除的交换到最后
然后复制一个新的数组到倒数第二
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
        System.out.println("要删除的数字的索引是"+index);

        int tmp =a[a.length-1];
        a[a.length-1]=a[index];
        a[index]=tmp;
        System.out.println(Arrays.toString(a));

        int[]b= new int[a.length-1];
        System.arraycopy(a,0,b,0,a.length-1);
        System.out.println(Arrays.toString(b));
    }
}