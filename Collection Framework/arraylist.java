import java.util.ArrayList;

class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(50);
        a.add(60);
        a.add(100);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(10);
        a2.add(20);
        a2.add(30);
        a2.add(40);
        a2.add(70);

        System.out.println(a);
        // a.retainAll(a2);
        // System.out.println(a);
        // a.removeAll(a2);
        System.out.println(a);

        System.out.println(a.isEmpty());

        a.clear();
        // System.out.println(a);
        System.out.println(a.isEmpty());
        a.isEmpty();

    }
}