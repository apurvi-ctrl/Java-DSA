package QUEUE;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class basic {
    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>();
        //queue.add(3);
        //queue.add(4);
        //queue.add(6);
        //queue.add(9);
        //queue.add(7);

        //System.out.println(queue.remove());
      Deque<Integer> deque = new ArrayDeque<>();
      deque.add(1);
      deque.add(2);
      deque.add(3);
      deque.removeFirst();


    }
}
