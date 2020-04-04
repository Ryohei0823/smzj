
class MyThread implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x < 100 ; x ++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"x = " + x);
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {
       MyThread mt = new MyThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
