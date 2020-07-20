package collection;

import java.util.HashMap;
/*
map.put(key,value)
map.get(key)
map.remove(key)
map.size()
for-each ������ HashMap �е�Ԫ��:
        // ��� key �� value
        for (Integer i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
		//�����ֻ���ȡ value������ʹ�� values() ����
*/

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, Object> map1 =new HashMap();
		Student stu1 =new Student("����11", 21, "��");
		Student stu2 =new Student("��÷÷11", 16, "Ů");

		//��ɾ
		map1.put("����", stu1);
		map1.put("��÷÷", stu2);
		map1.put("hhh", 222);
		map1.put("bbb", "this an Object");
		System.out.println(map1);
		map1.remove("hhh"); //����key�Ƴ�Ԫ��
		System.out.println(map1);

		//��ȡҲ�Ǹ���key��ȡ
		//HashMap����key��set����
		//(Student)
		//���������ķ�ʽ
		Student zhangs =(Student) map1.get("����");
		System.out.println(zhangs);
		System.out.println(map1.get("����"));

		System.out.println(map1.size());
		System.out.println(map1.containsKey("bbb"));
		System.out.println(map1.containsValue(zhangs));


		//ʵ���� ��TreeMap ��LinkedHashMap���ص���key�����key����
		//��

		//����keyʹ�õ���������
		map1.keySet().iterator();
	}
}
