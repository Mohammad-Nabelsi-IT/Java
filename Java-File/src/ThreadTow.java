public class ThreadTow implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public ThreadTow() {
        Thread thread1 = new Thread(this);
        Thread thread2 = new Thread(new Thread22());

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        new ThreadTow();

    }
}

class Thread22 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("test");
        }
    }
}

