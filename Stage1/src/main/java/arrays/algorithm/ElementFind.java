package arrays.algorithm;

public class ElementFind {
    public static void main(String[] args) {
        int[] a ={2,1,99,1,1,1,3,99};
        int index=-1;//通常-1代表没找到
        //遍历查找是否和目标相等，通过下标赋值巧妙的得出是否找到
        for (int i = 0; i < a.length; i++) {
            int target = 99;
            if (a[i]==target) {
                index = i;  //!通过给下标赋值，代表找到了，若最后都没找到/赋值，代表没找到
                System.out.println("找到了，索引是：" + index);
            }
        }
        if (index == -1){
            System.out.println("没有找到");
        }
    }
}