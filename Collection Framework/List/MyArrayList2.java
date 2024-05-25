import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class MyArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("kk");
        list1.add("ll");
        list1.add("oo");
        System.out.println(list1.get(0)); 
    }
}

class clss2 extends MyArrayList2{
    public static void main(String[] args) {
        MyArrayList2 m1=new MyArrayList2();

        ArrayList arr=new ArrayList(list1);
    }
}
