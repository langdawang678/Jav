package collectiondemo;

import java.util.HashMap;

public class MapDemo {
public static void main(String[] args) {
	HashMap<String, Object> map1 =new HashMap();
	Student stu1 =new Student("张三11", 21, "男");
	Student stu2 =new Student("李四11", 11, "男");
	map1.put("张三", stu1);
	map1.put("李四", stu2);
	map1.put("hhh", 222);
	System.out.println(map1);
	//获取也是根据key获取
	Student zs =(Student) map1.get("张三");
	System.out.println(zs);
}
}
