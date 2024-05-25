package Queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
public class MyLinkedList {
    public static void main(String[] args) {
        Deque<Integer> q1=new LinkedList<>();
        q1.offerFirst(1);
        q1.offerFirst(2);
        q1.offerFirst(3);
        q1.offerFirst(4);
        q1.offerLast(2);
        // q1.offerFirst(3);
        q1.offerLast(4);

        System.out.println(q1);
        System.out.println(q1.pollFirst());
        System.out.println(q1.pollLast());
        System.out.println(q1.poll());
    }
}
