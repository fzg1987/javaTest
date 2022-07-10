package test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeLock implements Runnable{

    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        try {
            if(reentrantLock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName() + " get Lock");
                Thread.currentThread().sleep(5000);
            } else {
                System.out.println(Thread.currentThread().getName() + " not Lock");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(reentrantLock.isHeldByCurrentThread())
                reentrantLock.unlock();
        }
    }
}
