package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
运行时，
1、get类具有的成员变量和方法，
    Field ageField = c.getDeclaredField("age");
    Method method =c.getDeclaredMethod("sayHello");
2、构造任意一个类的对象，
3、get一个对象所属的类，
    Class c = object.getClass();
4、invoke任意一个对象的方法，
    method.invoke(object);
是支撑框架开发的核心，

 */
public class ReflectDemo {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person();
        person.age=22;
        test(person);
    }
    public static void test(Object object) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = object.getClass(); // 获取object对象的类，Class类

        Field ageField = c.getDeclaredField("age");//获取类中的字段
        System.out.println(ageField.getInt(object));

        Method method =c.getDeclaredMethod("sayHello");//获取类中的方法
        method.setAccessible(true);//私有方法时，若没这行上面可以获取，但下面调用出错
        method.invoke(object); //调用对象的方法

        System.out.println(c.isAnnotationPresent(MyAnno.class)); //True,因为MyAnno中是RUNTIME级别
        System.out.println(ageField.getDeclaredAnnotation(MyAnno.class));//@reflect.MyAnno(name=bbbb)
        System.out.println(ageField.getDeclaredAnnotation(MyAnno.class).name1());//bbbb
    }

}

@MyAnno//使用注解
class Person{
    //@MyAnno
    @MyAnno(name1 = "bbbb")//也可在注解有default值的情况下，再复制
    int age;


//    void sayHello(){
    @MyAnno
    private void sayHello(){ //setAccessible时，需要加上method.setAccessible(true);
        System.out.println("Hello");
    }

}
