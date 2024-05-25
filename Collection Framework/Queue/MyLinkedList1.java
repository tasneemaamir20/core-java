package Queue;
import java.util.LinkedList;
import java.util.Deque;
public class MyLinkedList1 {
    public static void main(String[] args) {
        Deque<Integer>s1= new LinkedList<Integer>();
        s1.offerLast(2);
        s1.offerLast(22);
        s1.offerLast(23);
        s1.offerLast(25);

        System.out.println(s1);
        System.out.println(s1.pollFirst());
    }
}
