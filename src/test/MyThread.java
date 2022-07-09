package test;

public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i == 5){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("-----MyThread------");
        }
    }
}