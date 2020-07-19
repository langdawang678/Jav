package oop;

public class StaticDemo {
    int a =1;
    static int static_b =2; 	//静态变量

    //演示“普通方法可以访问 静态和非静态的变量和方法”
    public int fun1() {
        int c =3;				//局部变量c
        System.out.println("调用了普通方法 a+b="+(a+static_b));
        static_fun2();			//普通方法访问静态方法
        return a+static_b;  	//普通方法可以访问/调用静态b和非静态的变量a
    }

    //演示"静态方法不能访问非静态变量"
    public static int static_fun2() {	//静态方法
        System.out.println("调用了静态方法="+static_b);

        return static_b; 		//静态方法可以访问静态变量b
        //add();				//语法错误，静态方法不能访问实例方法
        //return a-b;			//语法错误，静态方法不能访问/调用非静态变量a。
        /*Cannot make a static reference to the non-static field a
         *change 'a'to static
         */
    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();

        System.out.println("----类能直接访问的只有静态成员----");
        //	System.out.println(staticDemo.a);	//报错,类不能直接访问属性，需要类的对象去访问
        //  staticDemo.add();					//报错，类不能直接访问方法,需要类的对象去访问
        System.out.println("类直接访问静态变量 ="+ StaticDemo.static_b);
        StaticDemo.static_fun2();			//类直接访问静态方法

        System.out.println("\n"+"----用对象去访问静态/非静态的属性和方法----");
        System.out.println("对象直接访问并修改 非静态变量  ="+(staticDemo.a=10));
        System.out.println("对象直接访问并修改 静态变量 ="+(staticDemo.static_b=20));//有黄色提示，如下截图
        staticDemo.fun1();					//对象直接访问非静态方法
        staticDemo.static_fun2();				//对象直接访问静态方法 	 //有黄色提示，如下截图
    }
}