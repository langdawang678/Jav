package collectiondemo;

import java.util.HashMap;

public class MapDemo {
public static void main(String[] args) {
	HashMap<String, Object> map1 =new HashMap();
	Student stu1 =new Student("����11", 21, "��");
	Student stu2 =new Student("����11", 11, "��");
	map1.put("����", stu1);
	map1.put("����", stu2);
	map1.put("hhh", 222);
	System.out.println(map1);
	//��ȡҲ�Ǹ���key��ȡ
	Student zs =(Student) map1.get("����");
	System.out.println(zs);
}
}
