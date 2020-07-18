package thread;

public class RunnableDemo {
    public static void main(String[] args) {
    	//方式1，把实现了Runnable接口的类的对象，作为参数去实例化Thread类对象：
        RunnableDemo1 runnableDemo1 =new RunnableDemo1();
    	Thread thread1 = new Thread(runnableDemo1); //public Thread(Runnable target) 
    	thread1.start();
    	
    	//方式2，也可由用匿名对象直接传入,注意后面的{}，
        Thread thread2 = new Thread(new RunnableDemo1() {});
        thread2.start();
        thread2.run();//run和start的 区别
    }
}

class RunnableDemo1 implements Runnable{
    @Override
    public void run() {
        System.out.println("实现Runnable的run()方法");
    }
}
