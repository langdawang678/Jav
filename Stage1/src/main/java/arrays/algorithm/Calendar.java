package arrays.algorithm;

import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        // 输入年份和月份
        System.out.print("input year and month:");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int month = scn.nextInt();
        // 计算指定年份月份的1号到1900年1月1日的天数
        // 1、求出从1900年1月1日到指定年份1月1日的整年天数:使用循环
        int yearDays = 0;
        for (int i = 1900; i < year; i++) {
            if (i%4==0 && i%100!=0 || i%400==0 ){  //此处极易错误写成year去余4
                yearDays += 366;
            }else {
                yearDays += 365;
            }
        }
        System.out.println("从1900-01-01到"+year+"的1月1日，一共有："+yearDays+"天");
        // 2、求出指定year年份1月1日到指定year年份month月份1日的天数:switch的穿透
        int monthDays =0;
        switch (month) {
            case 12:
                monthDays += 30; //选定12月，计算前11个月的值
            case 11:
                monthDays += 31;
            case 10:
                monthDays += 30;
            case 9:
                monthDays += 31;
            case 8:
                monthDays += 31;
            case 7:
                monthDays += 30;
            case 6:
                monthDays += 31;
            case 5:
                monthDays += 30;
            case 4:
                monthDays += 31;
            case 3://2月的
                if (year%4==0 && year%100!=0 || year%400==0 ){
                    monthDays += 29;
                }
                else {
                    monthDays += 28;
                }
            case 2:
                monthDays += 31;
                System.out.println("截止"+month+"月1号前，该"+"年有:"+monthDays+"天");
                break;
            default:
                System.out.println("tips：如要计算当年累计月份天数，请输入大于1的月份");
        }
        // 推算指定年份月份1号的星期，1代表星期，7代表星期天
        int weekday = (yearDays+monthDays)%7 +1 ;
        // 算出当月的天数
        int thisMonth =31 ;
        if (month == 4 || month == 6 || month == 9 ||month == 11) {
            thisMonth =30;
        }
        else {
            if (month ==2 && year%4==0 && year%100!=0 || year%400==0) {
                thisMonth = 29;
            }
            else {
                if (month==2) {
                    thisMonth =28;
                }
            }
        }
        System.out.println("该年"+month+"月天数："+thisMonth);
        // 输出
        // 1、输出表头
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日\t");
        // 2、输出前面的空格 ？空格有几个？
        for (int i = 0; i < weekday -1; i++) {
            System.out.print("\t");
        }
        // 3 、开始接着输出日期
        //写一下，得出规律：该月一号的星期weekday+需要换行的第i天==8；
        for (int i = 1; i <= thisMonth; i++) {
            System.out.print(i+"\t");
            if ((i+weekday)%7==1) {
                System.out.println("\t");
            }

        }
        //改进目标
        //1、输入月份和年份时验证有效范围
        //2、支持1900年之前的日历
    }
}