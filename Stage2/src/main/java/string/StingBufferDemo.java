package string;

//��Ϊ�ַ����Ĳ����ԣ�String�಻�ʺϲ����ַ��������޸ġ�ɾ����ƴ�ӡ�������StringBuffer
public class StingBufferDemo {
public static void main(String[] args) {
	//һ����ʾ�ַ���ƴ�ӵĺ�ʱ��
	String str3="";
	long time1 =System.currentTimeMillis();
	for(int i=0;i<10000;i++) {
		str3 = str3.concat(str3.valueOf(Math.random()));
		}	
	long time2 =System.currentTimeMillis();
	System.out.println("�ַ���ִ��ʱ�䣺"+(time2-time1));
	
	//�������ÿɱ��ַ���StringBuffer
	StringBuffer  sb = new StringBuffer();
	time1 =System.currentTimeMillis();
	for(int i= 0;i<10000;i++) {
		sb.append(Math.random());	
		}
	time2 =System.currentTimeMillis();
	System.out.println("�ɱ��ַ���ִ��ʱ�䣺"+(time2-time1));
	System.out.println();
}
}
