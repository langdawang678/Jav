package string;

import java.util.Scanner;

//�ַ���������
//scn.next()���ո�/�س���ʣ�µ�û�õ����Զ�����
//scan.nextLine()
public class StringInput {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("please input :");
		String str =scn.next();//ɨ�����Ч�ַ��𵽿ո�Tab���س��Ƚ����ַ�֮�������
		String str1 =scn.next();
		String str2 =scn.nextLine();//ɨ������������ݣ���ʹ��ʲô��û����ֱ�ӻس���Ҳ�����
		System.out.println(str+"\n"+str1+"\n"+str2);
		scn.close();
	}
}
