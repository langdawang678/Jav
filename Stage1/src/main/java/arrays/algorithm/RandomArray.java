package arrays.algorithm;
import java.util.Arrays;
import java.util.Random;
/*
创建一个随机数组（乱序）
 Random类对象调用nextInt()方法
 */
//随机数组长度、数组元素
//使用Random包的对象rand，调用nextInt()方法
public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(10);

        int[] a =new int[randNum];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println("数组a的长度："+randNum);
        System.out.println(Arrays.toString(a));
    }
}