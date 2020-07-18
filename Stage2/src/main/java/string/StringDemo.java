package string;

//字符串的创建
public class StringDemo {
public static void main(String[] args) {
	//直接创建
	String str ="this is a String demo";
	
	//使用类new创建
	String str1 = new String();//创建了一个空字符串
	String str2 = new String("java");
	
	//将字符数组转为一个字符串；
	char[] chars = {'a','b','你','好'};
	String str3 = new String(chars);
	
	//将字节字符数组转为一个字符串；
	byte[] bytes = {99,100,101};
	String str4 = new String(bytes);
	
	//Sting的静态方法valueOf将其他任何类型转为字符串
	String str5 = String.valueOf(1234);
	
	//printf格式化输出
	System.out.printf("%s,%s,%s,%s,%s,%s",str,str1,str2,str3,str4,str5);
	
	//将任何数据类型转为字符串
	StringDemo demo1 =new StringDemo();
	String str6 = demo1.toString();//toString 约等于valueOf，暂不展开
}
}
