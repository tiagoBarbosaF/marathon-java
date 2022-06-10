package tiagobarbosa.marathonjava.javacore.ZZGconcurrence.main;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();

        try {
//            if (lock.isHeldByCurrentThread()) {
//                System.out.printf("Thread %s enter in a critical session %n", name);
//            }
            System.out.printf("%d Threads are waiting on queue %n", lock.getQueueLength());
            System.out.printf("Thread %s will waiting 2s %n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finished the waiting %n",name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockMain01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
    }
}
