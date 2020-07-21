package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 给成员变量赋值操作
 *
 */
public class SynchronizedDemo {
    Lock lock=new ReentrantLock();
    //成员变量存储在堆内存里面，多个线程访问同一个堆内存，
    //即多个线程可以同时修改num的值，这样会导致线程安全问题
    private int num=0;

    public synchronized void  changeNum(boolean flag){
        //加入了同步synchronized方法，保证同一时间内，只有一个线程调用改方法。
//        public  void  changeNum(boolean flag){
        //没有synchronized时，多线程里调用同一对象时发生同步问题
        if(flag){
            num = 88;
        }else{
            num = 66;
        }
        System.out.println(Thread.currentThread().getName() + "=====" + "begin");
        System.out.println(Thread.currentThread().getName() + "=====" + num);
        System.out.println(Thread.currentThread().getName() + "=====" + "over");
    }

}

