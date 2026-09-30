package QUEUE;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        //CustomQueue queue = new CustomQueue();
        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(4);
        queue.insert(6);
        queue.insert(17);
        queue.insert(19);
        queue.insert(27);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(132);
        queue.display();


    }
}
