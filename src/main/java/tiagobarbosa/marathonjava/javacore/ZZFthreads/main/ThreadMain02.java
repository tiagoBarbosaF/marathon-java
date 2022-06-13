package tiagobarbosa.marathonjava.javacore.ZZFthreads.main;

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMain02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"), "T1");
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"), "T2");
        Thread t3 = new Thread(new ThreadExampleRunnable2("HA"), "T3");
        Thread t4 = new Thread(new ThreadExampleRunnable2("ME"), "T4");
        Thread t5 = new Thread(new ThreadExampleRunnable2("HA"), "T5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.join();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
