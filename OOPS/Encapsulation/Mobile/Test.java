package Mobile;
import java.util.Scanner;
public class Test {
    
public static void main(String[] args) {
    
Scanner sc=new Scanner(System.in);
Mobile m1=new Mobile("Apple", "Iphone 14 pro", 150000, new Battery(4500), new SimCard(), new SimCard());

m1.fullDetail();
// m1.insertSimCard();
boolean a=true;
while(a==true)
{
    System.out.println("do you want to insert any sim");
    System.out.println("yes/No");
    String choice=sc.nextLine();
    if(choice.equalsIgnoreCase("yes"))
    {
        m1.insertSimCard();
    }
    else if(choice.equalsIgnoreCase("no"))
    {
        a=false;
    }
    else
    {
        System.out.println("wrong input");
    }
}

}

}
