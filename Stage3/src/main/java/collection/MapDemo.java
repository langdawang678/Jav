package collection;

import java.util.HashMap;
/*
map.put(key,value)
map.get(key)
map.remove(key)
map.size()
for-each 来迭代 HashMap 中的元素:
        // 输出 key 和 value
        for (Integer i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
		//如果你只想获取 value，可以使用 values() 方法
*/

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, Object> map1 =new HashMap();
		Student stu1 =new Student("张三11", 21, "男");
		Student stu2 =new Student("韩梅梅11", 16, "女");

		//增删
		map1.put("张三", stu1);
		map1.put("韩梅梅", stu2);
		map1.put("hhh", 222);
		map1.put("bbb", "this an Object");
		System.out.println(map1);
		map1.remove("hhh"); //根据key移除元素
		System.out.println(map1);

		//获取也是根据key获取
		//HashMap里有key的set集合
		//(Student)
		//找数据最快的方式
		Student zhangs =(Student) map1.get("张三");
		System.out.println(zhangs);
		System.out.println(map1.get("张三"));

		System.out.println(map1.size());
		System.out.println(map1.containsKey("bbb"));
		System.out.println(map1.containsValue(zhangs));


		//实现类 有TreeMap 和LinkedHashMap，特点是key排序和key有序
		//略

		//按照key使用迭代器，略
		map1.keySet().iterator();
	}
}
