package reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Person {
        private String name;
        public Person(){
            System.out.println("Person��Ĺ��췽��");
        }

        public Person(String name) {
            this.name = name;
        }

        public void sing(){
            System.out.println("����");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//��ȡ������Class����
		//��һ�ַ�ʽ��
		//c1���õĶ����������Person��
		Class c1 = Class.forName("com.monkey1024.reflect.Person");
	
		//�ڶ��ַ�ʽ��
		//java��ÿ�����Ͷ��� class ����.
		Class c2 = Person.class;
	
		//�����ַ�ʽ��
		//java�������κ�һ��java������getClass ����
		Person p = new Person();
        String obj = "a";
        p.equals(obj);
		Class c3 = p.getClass(); 
	
		System.out.println(c1+"\n" +c2+"\n"+c3);
		//��ΪPerson�������JVM��ֻ��һ��������c1,c2,c3���ڴ��ַ����ͬ�ģ�ָ�����Ψһ��Class����.
		System.out.println(c1==c2); //true
		System.out.println(c2==c3); //true
		
		//Class��������֣�������
		System.out.println(c1.getName());
		
		
		//ʹ�÷��䴴��Person��Ķ���
		Object o = c1.newInstance();
		System.out.println("�������o��"+o);
		
		Field[] fields =c1.getDeclaredFields();
		System.out.println(Arrays.toString(fields));
	}
    }