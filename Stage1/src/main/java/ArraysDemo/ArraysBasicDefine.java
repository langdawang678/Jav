package ArraysDemo;
import java.util.Arrays;

public class ArraysBasicDefine {
    public static void main(String[] args) {
        /*
        四种方法：
        1.右侧有中括号[]就有new
        2.一般中括号[]里length不为空，除非右侧有大括号{}直接赋值
         */

        int[] num1 = new int[4];            //声明时直接new,赋值4个0

        int[] num2 = new int[] {2,3,4,5};   //声明时直接new，且赋值

        int[] num3;
        num3 = new int[] {3,4,5,6};         // 先声明，后赋值

        float[] score3 = {1,2,3,4};         //声明时直接赋值（省略new）

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(score3));
    }
}