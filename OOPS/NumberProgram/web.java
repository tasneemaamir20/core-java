import java.util.Scanner;
public class web
{
   
    public static void main(String[] args) {
    int i;
    double d;
    String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the int number :");
        i=sc.nextInt();
        System.out.println("Enter the double number:");
        d=sc.nextDouble();
        System.out.println("Enter the String :");
        // sc.nextLine();
        s=sc.nextLine();
        System.out.println(s);
        System.out.println(d);
        System.out.println(i);
    }
}