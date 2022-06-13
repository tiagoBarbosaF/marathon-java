package tiagobarbosa.marathonjava.javacore.ZZGconcurrence.main;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueMain01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue == LinkedTransferQueue

        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(Thread.currentThread().getName() + " -> " + tq.add("Tiago"));
        System.out.println(Thread.currentThread().getName() + " -> " + tq.offer("Barbosa"));
        System.out.println(Thread.currentThread().getName() + " -> " + tq.offer("Barbosa", 10, TimeUnit.SECONDS));
        tq.put("Farias");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Farias");
        }
        System.out.println(Thread.currentThread().getName() + " -> " + tq.tryTransfer("Peter"));
        System.out.println(Thread.currentThread().getName() + " -> " + tq.tryTransfer("Peter", 5, TimeUnit.SECONDS));
        System.out.println(Thread.currentThread().getName() + " -> " + tq.element());
        System.out.println(Thread.currentThread().getName() + " -> " + tq.peek());
        System.out.println(Thread.currentThread().getName() + " -> " + tq.poll());
        System.out.println(Thread.currentThread().getName() + " -> " + tq.remove());
        System.out.println(Thread.currentThread().getName() + " -> " + tq.take());
        System.out.println(Thread.currentThread().getName() + " -> " + tq.remainingCapacity());
    }
}
