package algorithm;

import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 4, 7, 5, 2};
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j-1] > a[j]) {  //从小到大排序
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
          System.out.print(Arrays.toString(a));
    }
}
