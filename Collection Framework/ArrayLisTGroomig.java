import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class ArrayLisTGroomig {
    
        public  static void show()
        {
            ArrayList <String> list=new ArrayList<>();
            list.add("Aamir");
            list.add("tas");
            list.add("BUS");
            System.out.println(list.get(1));
            Collections.reverse(list);

            System.out.println(list.get(0));
        }
        public static void main(String[] args) {
            show();
        }
// public static void main(String[] args) {
//     Stack<String> n=new Stack<>();
//     n.push("aamir");
//     n.push("saad");
//     n.push("maaz");
//     n.push("naaz");
//     n.push("paas");
//     n.push("daas");

//     System.out.println(n.get(0));
//     System.out.println(n.get(1));
//     System.out.println(n.get(2));
//     System.out.println(n.get(3));
//     System.out.println(n.get(4));
//     System.out.println(n.get(5));
//     System.out.println(n.pop());
//     Collection.reverse(n);
//     System.out.println(n.pop());
// }
     

    }

