import java.util.Stack;

public class MyStack2 {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        Stack<Integer> s2=new Stack<>();
        s2.push(5);
        s2.push(6);
        s2.push(7);
        s2.push(8);


        s1.addAll(s2);

        System.out.println(s2);
        System.out.println(s1.contains(7));
        System.out.println(s1.remove(6));
        System.out.println(s1.containsAll(s2));
        System.out.println(s1.pop());

        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.empty());
    }
}
