import java.util.*;


public class stacktask2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        // String str=sc.next();
        String st = "jspider";
        String emp = "";
        for (int i = 0; i < st.length(); i++) {
            s.push(st.charAt(i));
        }
        System.out.println(s);

        while (!s.empty()) {

        }
System.out.println(s.pop());
    }
}
