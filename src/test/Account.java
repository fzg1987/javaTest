package test;

import java.util.concurrent.locks.ReentrantLock;

public class Account implements Runnable{

    private static int num;
    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        reentrantLock.lock();
        try {
            Thread.currentThread().sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "是当前的第" + num + "位访客");
        reentrantLock.unlock();
    }
}
