package string;/*演示字符、字符数组、字符串
 *1. String转字符数组：str.toCharArray()
 *2. Sting第0个位置的字符：str.charAt(0)
 *3. 字符数组构造String：new String(char[] value ,int offset,int count)
 */
import java.util.Arrays;
public class StringAPIDemo {
public static void main(String[] args) {
	String str1 ="good morning";
	char[] chararry1 =str1.toCharArray();
	System.out.println(Arrays.toString(chararry1));//[g, o, o, d,  , m, o, r, n, i, n, g]
	
	System.out.println(str1.charAt(0));//g
	
	char[] charArray2 = {'h','a','p','p','y'};
	String str2 =new String(charArray2);
	String str3 =new String(charArray2,1,3);
	System.out.println(str2);//happy
	System.out.println(str3);//app
}
}
