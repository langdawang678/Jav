package collection;
/*���ϱ�����Ҫʹ�õ�����Iterator����������������
��Ϊ����Ҫ֪�����ϵ��ڲ��ṹ��
 * 1�����ɵ�������it��
 * 2��while����������hasNext()��
 * 3����next()������ȡ����
 * 4������
 */
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("�ַ���"));
		list.add("�ַ���");
		list.add("�ַ���");
		list.add("�ַ���");
		list.add(null);
		System.out.println(list);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object element = iterator.next();
			if (element == null) {
				iterator.remove();
			}	
		}
		System.out.println(list);
	}
}
