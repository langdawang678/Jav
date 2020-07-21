package reflect;

import java.lang.annotation.*;

@Inherited //父类的注解可以被子类继承
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/*Retention定义一个Annotation的保存范围
RetentionPolicy.SOURCE，只在源文件，编译时注解被丢弃，class文件中没有。@Override采用这个。
    在target/classes下的对应class文件能 看不到注解
RetentionPolicy.ClASS，在类文件中，但不被加载到JVM中，默认是CLASS级别。
    在target/classes下的对应class文件  能看到注解
RetentionPolicy.RUNTIME，都保存，可反射性读取。注解要配合反射机制，就必须设置这个。
    使用注解的地方，调用getDeclaredAnnotation()能看到
    或者isAnnotationPresent(MyAnno.class)返回True
 */
public @interface MyAnno {
//    String name(); //写上变量后，Person就报错了
    String name1() default "11"; //设置default后，Person不报错
}
