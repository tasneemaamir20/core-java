import java.util.*;
public class stacklinked {

    public static void main(String[] args) {
        // making the stack using the linkedlist
        LinkedList <String> stack=new LinkedList<>();
        stack.offerFirst("Dairy Milk");
        stack.offerFirst("Kitkat");
        stack.offerFirst("Milky bar");
        System.out.println(stack.pollFirst());
        stack.offerFirst("5 star");
        stack.offerFirst("munch");
        stack.offerFirst("perk");
        System.out.println(stack.peekFirst());
        stack.offerFirst("snickers");
        stack.offerFirst("fuse");
        System.out.println(stack);


    }
}
