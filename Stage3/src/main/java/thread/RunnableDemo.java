package thread;

public class RunnableDemo {
    public static void main(String[] args) {
    	//��ʽ1����ʵ����Runnable�ӿڵ���Ķ�����Ϊ����ȥʵ����Thread�����
        RunnableDemo1 runnableDemo1 =new RunnableDemo1();
    	Thread thread1 = new Thread(runnableDemo1); //public Thread(Runnable target) 
    	thread1.start();
    	
    	//��ʽ2��Ҳ��������������ֱ�Ӵ���,ע������{}��
        Thread thread2 = new Thread(new RunnableDemo1() {});
        thread2.start();
        thread2.run();//run��start�� ����
    }
}

class RunnableDemo1 implements Runnable{
    @Override
    public void run() {
        System.out.println("ʵ��Runnable��run()����");
    }
}
