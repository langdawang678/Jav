package string;

/*演示字符串的不变性和字符串缓存
 * $结论：String不被重新赋值时，源字符串是不变的，如replace和toUpperCase时
 * $因为不会改变str1的值，而是产生新的字符串
 *$因此String类不适合操作字符串，如修改、删除、拼接
 */
public class StringUnchangable {
public static void main(String[] args) {
	String str1 = "111 this is demo ";
	str1=str1.replace("111", "222");
	System.out.println(str1);//222 this is demo 
	String str2 = str1.replace("222", "333");
	System.out.println(str1+"; "+str2+"\n");//222 this is demo ; 333 this is demo 

	String str3="hello ";
	//直接转大写，没有重新赋值
	str3.toUpperCase();
	System.out.println(str3);//hello
	//转大写，并重新赋值
	str3 = str3.toUpperCase();
	System.out.println(str3);//HELLO
	
	//$字符串缓存,编译器会自动把内容相同的字符串优化为同一个对象/引用。
	//$new String(“xxx”)的不算，不进缓存，引用的地址还是不相同的
	String str7="一二三四";
	String str8="一二三四";
	System.out.println(str7==str8);//true
	System.out.println(str7.equals(str7));//true
	
	String str9=new String("一二三四");
	String str10=new String("一二三四");
	System.out.println(str9 == str10);//false
	}
}


