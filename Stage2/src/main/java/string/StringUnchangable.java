package string;

/*��ʾ�ַ����Ĳ����Ժ��ַ�������
 * $���ۣ�String�������¸�ֵʱ��Դ�ַ����ǲ���ģ���replace��toUpperCaseʱ
 * $��Ϊ����ı�str1��ֵ�����ǲ����µ��ַ���
 *$���String�಻�ʺϲ����ַ��������޸ġ�ɾ����ƴ��
 */
public class StringUnchangable {
public static void main(String[] args) {
	String str1 = "111 this is demo ";
	str1=str1.replace("111", "222");
	System.out.println(str1);//222 this is demo 
	String str2 = str1.replace("222", "333");
	System.out.println(str1+"; "+str2+"\n");//222 this is demo ; 333 this is demo 

	String str3="hello ";
	//ֱ��ת��д��û�����¸�ֵ
	str3.toUpperCase();
	System.out.println(str3);//hello
	//ת��д�������¸�ֵ
	str3 = str3.toUpperCase();
	System.out.println(str3);//HELLO
	
	//$�ַ�������,���������Զ���������ͬ���ַ����Ż�Ϊͬһ������/���á�
	//$new String(��xxx��)�Ĳ��㣬�������棬���õĵ�ַ���ǲ���ͬ��
	String str7="һ������";
	String str8="һ������";
	System.out.println(str7==str8);//true
	System.out.println(str7.equals(str7));//true
	
	String str9=new String("һ������");
	String str10=new String("һ������");
	System.out.println(str9 == str10);//false
	}
}


