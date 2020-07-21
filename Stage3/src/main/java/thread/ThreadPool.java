package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/*
四种线程池：
//可缓存线程池，该线程池中没有核心线程，就是无限大，适用于耗时少，任务量大的情况
ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//可重用固定个数的线程池，有核心线程，核心线程的即为最大的线程数量，没有非核心线程
ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
//周期性执行的线程池，适用定时及周期性任务执行——延迟执行，也为无限大
ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
//单线程化的线程池，适用于有顺序的任务的应用场景。核心线程的即为最大的线程数量。
ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
 */
public class ThreadPool {
    public static void main(String[] args) {
        //创建一个定长线程池，支持定时及周期性任务执行——延迟执行
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //延迟1秒执行
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("延迟1秒执行");
            }
        }, 1, TimeUnit.SECONDS);
    }
}

