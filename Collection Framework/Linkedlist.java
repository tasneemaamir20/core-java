import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.offer("Biryani");
        l.offer("kabab");
        l.offer("nahari");
        System.out.println(l.peek());
        System.out.println(l.poll());
        System.out.println(l);

        l.offer("afghani");
        l.offer("shawarma");
        l.offer("chicken tikka");
        l.offer("fish fry");
        l.offer("shahi tukda");
        System.out.println(l);

    }
}
