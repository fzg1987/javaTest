package test;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    test2.test();
                }
            });
            thread.start();
        }
    }

    public void test(){
        synchronized (this){
            System.out.println("start...");
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("end");
        }
    }
}
