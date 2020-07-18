package string;

import java.util.Scanner;

//字符串的输入
//scn.next()遇空格/回车，剩下的没用到就自动销毁
//scan.nextLine()
public class StringInput {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("please input :");
		String str =scn.next();//扫描从有效字符起到空格，Tab，回车等结束字符之间的内容
		String str1 =scn.next();
		String str2 =scn.nextLine();//扫描你输入的内容，即使你什么都没输入直接回车他也会输出
		System.out.println(str+"\n"+str1+"\n"+str2);
		scn.close();
	}
}
