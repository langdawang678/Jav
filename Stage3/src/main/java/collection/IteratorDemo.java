package collection;/*�����ڱ�����ͬʱ��������Ҫʹ�õ�������������������
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
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element == null) {
				it.remove();
			}	
		}
		System.out.println(list);
	}
}
