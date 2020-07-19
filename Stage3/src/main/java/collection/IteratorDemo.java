package collection;/*集合在遍历的同时操作，需要使用迭代器，而非其他遍历
 * 1先生成迭代对象it，
 * 2再while迭代对象有hasNext()，
 * 3再用next()方法获取对象，
 * 4最后操作
 */
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("字符串"));
		list.add("字符串");
		list.add("字符串");
		list.add("字符串");
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
