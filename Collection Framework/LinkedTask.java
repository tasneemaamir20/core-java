import java.util.LinkedList;

public class LinkedTask {
    public static void main(String[] args) {
        LinkedList <String> mydream=new LinkedList<>();
        mydream.offer("Makka");
        mydream.offer("Madina");
        mydream.offer("Agra");
        mydream.offer("Delhi");
        mydream.offer("Kashmir");
        System.out.println(mydream);
    

        LinkedList <String> frnddream=new LinkedList<>();
        frnddream.offer("Singapore");
        frnddream.offer("Mumbai");
        frnddream.offer("Kashmir");
        frnddream.offer("Darjeling");
        frnddream.offer("denmark");
        System.out.println(frnddream);


        mydream.addAll(frnddream);
        System.out.println(mydream);

        LinkedList <String> alreadyvisited=new LinkedList<>();
        alreadyvisited.offer("Agra");
        alreadyvisited.offer("Delhi");
        alreadyvisited.offer("Jaipur");
        alreadyvisited.offer("Darjeling");
        alreadyvisited.offer("Lucknow");
        System.out.println(alreadyvisited);

        mydream.removeAll(alreadyvisited);
        System.out.println(mydream);

        LinkedList <String> gfwants=new LinkedList<>();
        gfwants.offer("Makka");
        gfwants.offer("Madina");
        gfwants.offer("sikkim");
        gfwants.offer("Kerala");
        gfwants.offer("kashmir");
        System.out.println(gfwants);

        mydream.retainAll(gfwants);
        System.out.println(mydream);
        System.out.println( mydream.contains("Dehradun"));

       
        
    }
}
