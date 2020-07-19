package ArraysDemo;
/*
1.Arrays.sort(arr)排序
2.Arrays.toString(arr)
3.Arrays.binarySearch(arr)二分法查找，前提是数组有序
4.Arrays.equals(arr)判断是否相等
5.Arrays.fill(原数组，目标值)
6.System.arrayCopy(原数组，原数组开始位置，目标数组，目标数组开始位置，要copy进入的长度) //了解即可
 */
import java.util.Arrays;
public class ArraysFunction {
    public static void main(String[] args) {
        int[] num1 = {12,11,13,18,14,55,99};
        int[] num2 = {1,2,3,4,5,6,7,8,9,10};
        //1.Arrays.sort()排序
        //2.Arrays.toString()
        Arrays.sort(num1);
        System.out.println("sort排序后："+Arrays.toString(num1));//sort排序后：[11, 12, 13, 14, 18, 55, 99]

        //3.Arrays.binarySearch()二分法查找，前提是数组有序
        int index =Arrays.binarySearch(num1, 99);
        System.out.println("找到99，索引为："+index);//找到99，索引为：6

        //4.Arrays.equals()判断是否相等
        System.out.println(Arrays.equals(num1, num2));//false

        //5.Arrays.fill(原数组，目标值)
        Arrays.fill(num2,88);
        System.out.println(Arrays.toString(num2));//[88, 88, 88, 88, 88, 88, 88, 88, 88, 88]

        //6.数组的复制：System.arraycopy ,知道有这么个方法，用的时候还是查API
        /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
　　      Object src : 原数组
         int srcPos : 从元数据的起始位置开始
　       Object dest : 目标数组
　       int destPos : 目标数组的开始起始位置
　　     int length  : 要copy的数组的长度
         */
        int[] num10 = {0,1,2,3,4,5};
        int[] num11 = {10,11,12,13,14,15,16};
        System.arraycopy(num10,2,num11,0,3);
        System.out.println(Arrays.toString(num11));//[2, 3, 4, 13, 14, 15, 16]
    }
}