package thread;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main1(String[] args) {
        Data data = new Data();
        new Thread(()->{
            Data.func1();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        new Thread(()->{
            Data.func2();
        },"B").start();
    }

    public static void main(String[] args) {
        Data2 data2 = new Data2();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                data2.func();
            }).start();
        }
    }
}
class Data{
    public synchronized static void func1(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            }
        System.out.println("1...");
    }

    public synchronized static void func2(){
        System.out.println("2...");
    }
}
class Data2{
    public void func(){
        synchronized (this){
            System.out.println("start...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("end...");
        }
    }
}
