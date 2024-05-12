import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class mainPersonClass {
    public static void main(String[] args) {
        Person p1=new Person("Tasneem Amir",23,'M');
       
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());

        Scanner  sc=new Scanner(System.in);
        Person p2=new Person(sc.nextLine(),sc.nextInt(),sc.next().charAt(0));
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getGender());


        Person p3=new Person ();
        p3.setName("Hamza");
        System.out.println(p3.getName());

        p3.setAge(6);
        System.out.println(p3.getAge());

         p3.setGender('M');
        System.out.println(p3.getGender());
        

    }
}
