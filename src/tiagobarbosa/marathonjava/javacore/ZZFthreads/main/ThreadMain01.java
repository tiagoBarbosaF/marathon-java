package tiagobarbosa.marathonjava.javacore.ZZFthreads.main;

class ThreadExample extends Thread {
    private final char c;


    ThreadExample(char c) {
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
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private final char c;

    ThreadExampleRunnable(char c) {
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
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMain01 {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample('A');
        ThreadExample t2 = new ThreadExample('B');
        ThreadExample t3 = new ThreadExample('C');
        ThreadExample t4 = new ThreadExample('D');
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread t5 = new Thread(new ThreadExampleRunnable('A'), "T5A");
        Thread t6 = new Thread(new ThreadExampleRunnable('B'), "T6B");
        Thread t7 = new Thread(new ThreadExampleRunnable('C'), "T7C");
        Thread t8 = new Thread(new ThreadExampleRunnable('D'), "T8D");
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
