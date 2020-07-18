package string;

//因为字符串的不变性，String类不适合操作字符串，如修改、删除、拼接。所以用StringBuffer
public class StingBufferDemo {
public static void main(String[] args) {
	//一、演示字符串拼接的耗时：
	String str3="";
	long time1 =System.currentTimeMillis();
	for(int i=0;i<10000;i++) {
		str3 = str3.concat(str3.valueOf(Math.random()));
		}	
	long time2 =System.currentTimeMillis();
	System.out.println("字符串执行时间："+(time2-time1));
	
	//二、改用可变字符串StringBuffer
	StringBuffer  sb = new StringBuffer();
	time1 =System.currentTimeMillis();
	for(int i= 0;i<10000;i++) {
		sb.append(Math.random());	
		}
	time2 =System.currentTimeMillis();
	System.out.println("可变字符串执行时间："+(time2-time1));
	System.out.println();
}
}
