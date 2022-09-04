package ThreadPool;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        // 1. 核心线程数 - 3
        // 2. 最大线程数 - 5
        // 3. 保活时间 - 1
        // 4. 时间单位 - 秒
        // 5. 等待队列 - 5
        // 6. 线程工厂 - 此处为默认线程工厂
        // 7. 拒绝策略 - 此处为抛异常
        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 1L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 9; i++) {
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName() + "===>办理业务");
            });
        }
        executorService.shutdown();

    }
}
