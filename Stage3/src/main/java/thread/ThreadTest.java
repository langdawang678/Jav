package thread;

//1.�Զ���һ���࣬�̳�java.lang���µ�Thread��
class MyThread extends Thread {
    //2.��дrun����
    public void run() {
        //3.��Ҫ���߳���ִ�еĴ����д��run������
        for(int i = 0; i < 1000; i++) {
            System.out.println("run����");
        }
    }
}

public class ThreadTest{

    public static void main(String[] args) {
        //4.���������Զ�����Ķ���
        //����һ���߳�
        MyThread mt = new MyThread();

        //5.����start���������߳�
        mt.start();

        //��ѭ���Ĵ������ö�һЩ������û�ȵ�CPU�л����Ѿ���ӡ�����
        for(int i = 0; i < 1000; i++) {
            System.out.println("main�߳�");
        }
    }
}