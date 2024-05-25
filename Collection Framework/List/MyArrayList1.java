import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList1 {
    public  static void show()
        {
            ArrayList <String> list=new ArrayList<>();
            list.add("Aamir");
            list.add("tas");
            list.add("BUS");
            System.out.println(list.get(1));


            Collections.reverse(list);                   //!this method is used to reverse any collection object 

            System.out.println(list.get(0));
        }
        public static void main(String[] args) {
            show();
        }
}
