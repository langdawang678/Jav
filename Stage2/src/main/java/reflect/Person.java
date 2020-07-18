package reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Person {
        private String name;
        public Person(){
            System.out.println("Person类的构造方法");
        }

        public Person(String name) {
            this.name = name;
        }

        public void sing(){
            System.out.println("唱歌");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//获取这个类的Class对象
		//第一种方式：
		//c1引用的对象代表整个Person类
		Class c1 = Class.forName("com.monkey1024.reflect.Person");
	
		//第二种方式：
		//java中每个类型都有 class 属性.
		Class c2 = Person.class;
	
		//第三种方式：
		//java语言中任何一个java对象都有getClass 方法
		Person p = new Person();
        String obj = "a";
        p.equals(obj);
		Class c3 = p.getClass(); 
	
		System.out.println(c1+"\n" +c2+"\n"+c3);
		//因为Person这个类在JVM中只有一个，所以c1,c2,c3的内存地址是相同的，指向堆中唯一的Class对象.
		System.out.println(c1==c2); //true
		System.out.println(c2==c3); //true
		
		//Class对象的名字，即类名
		System.out.println(c1.getName());
		
		
		//使用反射创建Person类的对象
		Object o = c1.newInstance();
		System.out.println("输出对象o："+o);
		
		Field[] fields =c1.getDeclaredFields();
		System.out.println(Arrays.toString(fields));
	}
    }