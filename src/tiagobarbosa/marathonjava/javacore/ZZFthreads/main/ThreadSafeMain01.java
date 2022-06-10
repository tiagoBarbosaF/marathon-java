package tiagobarbosa.marathonjava.javacore.ZZFthreads.main;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void removeFirst() {
        if (names.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeMain01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Tiago");
        Runnable removeFirst = threadSafeNames::removeFirst;
        new Thread(removeFirst).start();
        new Thread(removeFirst).start();
    }
}
