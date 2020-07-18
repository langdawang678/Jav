package algorithm;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入年份");
        int year=sc.nextInt();
        //四年一闰；百年不闰，四百年再闰.
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("该年是闰年");
        }
        else{
            System.out.println("该年是平年");
        }
    }
}