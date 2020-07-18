package algorithm;

public class MaxMinOfArray {
    public static void main(String[] args) {
        int [] a={13,2,5,11,66,77};
        int max=a[0];
        int min=a[0];
        for (int i=0;i<a.length;i++) {
            System.out.print("a["+i+"]:="+a[i]+", ");
            if (a[i]>max)
            {
                max=a[i];
            }
            else if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
    }
}
