package LINKEDLIST.main;

public class LL {
    public static void main(String[] args) {
        Main list = new Main();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(16);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100,3);
        System.out.println(list.deleteFirst());
         list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88,2);
        list.display();
    }
}
