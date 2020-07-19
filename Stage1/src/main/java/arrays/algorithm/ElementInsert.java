package arrays.algorithm;
import java.util.Arrays;
public class ElementInsert {
    public static void main(String[] args) {

        //1.确定要插入的数组（新建一个length+1的）
        int[] a ={1,2,3,4,5,6,7};
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));

        //2.确定要插入的位置和数据
        int index =4;
        int data =99;

        //3.移动数据（倒数第二个右移+1，倒数第三个右移+1，直到遇到index）
        for (int i = b.length-1; i >index; i--) {
            b[i] =b[i-1];
        }

        //4.赋值待插入的数据，打印
        b[index] =99;
        System.out.println(Arrays.toString(b));
    }
}