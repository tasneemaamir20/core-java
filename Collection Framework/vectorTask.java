import java.util.Vector;
import java.util.Collections;


public class vectorTask {
    public static void main(String[] args) {
        Vector <Integer> v=new Vector<>();
        v.add(10);
        v.add(60);
        v.add(50);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(80);
        v.add(60);
       
        System.out.println(v);

        Collections.sort(v);
        System.out.println(v);

        
        Vector <String> s=new Vector<>();
        s.add("tasneem");
        s.add("Aamir");
        s.add("Tamseel");
        s.add("nidhi");
        s.add("needhi");
        Collections.sort(s);

        System.out.println(s);

        // Callbyfunction
        int i=20;
        demo(i);
        System.out.println(i);
    }
    public static void demo(int i)
    {
        i=i+10;
    }
}
