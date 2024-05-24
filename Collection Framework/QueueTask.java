import java.util.Deque;
import java.util.Queue;

public class QueueTask {
    public static void main(String[] args) {
        Deque <Integer> q=new Deque<Integer>();
        q.offer(1);
        System.out.println(q.poll());
    }
}
