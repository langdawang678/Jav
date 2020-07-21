package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/*
�����̳߳أ�
//�ɻ����̳߳أ����̳߳���û�к����̣߳��������޴������ں�ʱ�٣�������������
ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//�����ù̶��������̳߳أ��к����̣߳������̵߳ļ�Ϊ�����߳�������û�зǺ����߳�
ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
//������ִ�е��̳߳أ����ö�ʱ������������ִ�С����ӳ�ִ�У�ҲΪ���޴�
ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
//���̻߳����̳߳أ���������˳��������Ӧ�ó����������̵߳ļ�Ϊ�����߳�������
ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
 */
public class ThreadPool {
    public static void main(String[] args) {
        //����һ�������̳߳أ�֧�ֶ�ʱ������������ִ�С����ӳ�ִ��
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //�ӳ�1��ִ��
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("�ӳ�1��ִ��");
            }
        }, 1, TimeUnit.SECONDS);
    }
}

