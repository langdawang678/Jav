package thread;

//1.自定义一个类，继承java.lang包下的Thread类
class MyThread extends Thread {
    //2.重写run方法
    public void run() {
        //3.将要在线程中执行的代码编写在run方法中
        for(int i = 0; i < 1000; i++) {
            System.out.println("run方法");
        }
    }
}

public class ThreadTest{

    public static void main(String[] args) {
        //4.创建上面自定义类的对象
        //创建一个线程
        MyThread mt = new MyThread();

        //5.调用start方法启动线程
        mt.start();

        //将循环的次数设置多一些，否则还没等到CPU切换就已经打印完成了
        for(int i = 0; i < 1000; i++) {
            System.out.println("main线程");
        }
    }
}