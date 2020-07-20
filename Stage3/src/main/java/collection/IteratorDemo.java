package collection;
/*集合遍历需要使用迭代器Iterator，而非其他遍历。
因为不需要知道集合的内部结构。
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
