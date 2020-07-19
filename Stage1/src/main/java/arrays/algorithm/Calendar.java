package arrays.algorithm;

import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        // ������ݺ��·�
        System.out.print("input year and month:");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int month = scn.nextInt();
        // ����ָ������·ݵ�1�ŵ�1900��1��1�յ�����
        // 1�������1900��1��1�յ�ָ�����1��1�յ���������:ʹ��ѭ��
        int yearDays = 0;
        for (int i = 1900; i < year; i++) {
            if (i%4==0 && i%100!=0 || i%400==0 ){  //�˴����״���д��yearȥ��4
                yearDays += 366;
            }else {
                yearDays += 365;
            }
        }
        System.out.println("��1900-01-01��"+year+"��1��1�գ�һ���У�"+yearDays+"��");
        // 2�����ָ��year���1��1�յ�ָ��year���month�·�1�յ�����:switch�Ĵ�͸
        int monthDays =0;
        switch (month) {
            case 12:
                monthDays += 30; //ѡ��12�£�����ǰ11���µ�ֵ
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
            case 3://2�µ�
                if (year%4==0 && year%100!=0 || year%400==0 ){
                    monthDays += 29;
                }
                else {
                    monthDays += 28;
                }
            case 2:
                monthDays += 31;
                System.out.println("��ֹ"+month+"��1��ǰ����"+"����:"+monthDays+"��");
                break;
            default:
                System.out.println("tips����Ҫ���㵱���ۼ��·����������������1���·�");
        }
        // ����ָ������·�1�ŵ����ڣ�1�������ڣ�7����������
        int weekday = (yearDays+monthDays)%7 +1 ;
        // ������µ�����
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
        System.out.println("����"+month+"��������"+thisMonth);
        // ���
        // 1�������ͷ
        System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������\t");
        // 2�����ǰ��Ŀո� ���ո��м�����
        for (int i = 0; i < weekday -1; i++) {
            System.out.print("\t");
        }
        // 3 ����ʼ�����������
        //дһ�£��ó����ɣ�����һ�ŵ�����weekday+��Ҫ���еĵ�i��==8��
        for (int i = 1; i <= thisMonth; i++) {
            System.out.print(i+"\t");
            if ((i+weekday)%7==1) {
                System.out.println("\t");
            }

        }
        //�Ľ�Ŀ��
        //1�������·ݺ����ʱ��֤��Ч��Χ
        //2��֧��1900��֮ǰ������
    }
}