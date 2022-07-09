package test;

import static java.lang.Thread.sleep;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        Thread thread1 = new Thread(account,"线程A");
        Thread thread2 = new Thread(account,"线程B");
        thread1.start();
        thread2.start();
    }
}
