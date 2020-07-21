package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
����ʱ��
1��get����еĳ�Ա�����ͷ�����
    Field ageField = c.getDeclaredField("age");
    Method method =c.getDeclaredMethod("sayHello");
2����������һ����Ķ���
3��getһ�������������࣬
    Class c = object.getClass();
4��invoke����һ������ķ�����
    method.invoke(object);
��֧�ſ�ܿ����ĺ��ģ�

 */
public class ReflectDemo {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person();
        person.age=22;
        test(person);
    }
    public static void test(Object object) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = object.getClass(); // ��ȡobject������࣬Class��

        Field ageField = c.getDeclaredField("age");//��ȡ���е��ֶ�
        System.out.println(ageField.getInt(object));

        Method method =c.getDeclaredMethod("sayHello");//��ȡ���еķ���
        method.setAccessible(true);//˽�з���ʱ����û����������Ի�ȡ����������ó���
        method.invoke(object); //���ö���ķ���

        System.out.println(c.isAnnotationPresent(MyAnno.class)); //True,��ΪMyAnno����RUNTIME����
        System.out.println(ageField.getDeclaredAnnotation(MyAnno.class));//@reflect.MyAnno(name=bbbb)
        System.out.println(ageField.getDeclaredAnnotation(MyAnno.class).name1());//bbbb
    }

}

@MyAnno//ʹ��ע��
class Person{
    //@MyAnno
    @MyAnno(name1 = "bbbb")//Ҳ����ע����defaultֵ������£��ٸ���
    int age;


//    void sayHello(){
    @MyAnno
    private void sayHello(){ //setAccessibleʱ����Ҫ����method.setAccessible(true);
        System.out.println("Hello");
    }

}
