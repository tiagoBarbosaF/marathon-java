package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
