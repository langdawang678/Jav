package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCycleDefine {
    public static void main(String[] args) {
        /*
        循环输入成绩
        成绩录入数组
        打印数组
         */
        int[] score = new int[5];
        for (int i=0;i<5;i++){
            System.out.printf("输入第%d次成绩，每次用确定键结束:",i+1);
            Scanner scn = new Scanner(System.in);
            score[i]=scn.nextInt();
        }
        System.out.println("5次的成绩是："+Arrays.toString(score));
    }
}