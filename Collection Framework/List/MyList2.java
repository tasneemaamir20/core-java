import java.util.ArrayList;
import java.util.List;

public class MyList2 {
    public static void main(String[] args) {
        List <Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(6);

        List <Integer> l2=new ArrayList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);


        //  this is addAll(int index, collection) the index we have pass collection add at that index 
        l1.addAll(2,l2);          


        // in this method collection add at the end position in this we have not pass any indexing value
        // l1.addAll(l2);

        System.out.println(l1);

        // to search element using indexing indexOf()
        System.out.println(l1.indexOf(3));

    }
}
