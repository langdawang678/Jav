package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ����Ա������ֵ����
 *
 */
public class SynchronizedDemo {
    Lock lock=new ReentrantLock();
    //��Ա�����洢�ڶ��ڴ����棬����̷߳���ͬһ�����ڴ棬
    //������߳̿���ͬʱ�޸�num��ֵ�������ᵼ���̰߳�ȫ����
    private int num=0;

    public synchronized void  changeNum(boolean flag){
        //������ͬ��synchronized��������֤ͬһʱ���ڣ�ֻ��һ���̵߳��øķ�����
//        public  void  changeNum(boolean flag){
        //û��synchronizedʱ�����߳������ͬһ����ʱ����ͬ������
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

