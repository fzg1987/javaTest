package test;

import static java.lang.Thread.sleep;

public class Test {
    public static void main(String[] args) {
        TimeLock timeLock = new TimeLock();
        new Thread(timeLock,"线程A").start();
        new Thread(timeLock,"线程B").start();
    }
}
