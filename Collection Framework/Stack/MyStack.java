
import java.util.Stack;


public class MyStack{
    
        public static void main(String[] args) {
    Stack<String> n=new Stack<>();
    n.push("aamir");
    n.push("saad");
    n.push("maaz");
    n.push("naaz");
    n.push("paas");
    n.push("daas");

    System.out.println(n.get(0));
    System.out.println(n.get(1));
    System.out.println(n.get(2));
    System.out.println(n.get(3));
    System.out.println(n.get(4));
    System.out.println(n.get(5));
    System.out.println(n.pop());
}
    }
