package string;

//�ַ����Ĵ���
public class StringDemo {
public static void main(String[] args) {
	//ֱ�Ӵ���
	String str ="this is a String demo";
	
	//ʹ����new����
	String str1 = new String();//������һ�����ַ���
	String str2 = new String("java");
	
	//���ַ�����תΪһ���ַ�����
	char[] chars = {'a','b','��','��'};
	String str3 = new String(chars);
	
	//���ֽ��ַ�����תΪһ���ַ�����
	byte[] bytes = {99,100,101};
	String str4 = new String(bytes);
	
	//Sting�ľ�̬����valueOf�������κ�����תΪ�ַ���
	String str5 = String.valueOf(1234);
	
	//printf��ʽ�����
	System.out.printf("%s,%s,%s,%s,%s,%s",str,str1,str2,str3,str4,str5);
	
	//���κ���������תΪ�ַ���
	StringDemo demo1 =new StringDemo();
	String str6 = demo1.toString();//toString Լ����valueOf���ݲ�չ��
}
}
