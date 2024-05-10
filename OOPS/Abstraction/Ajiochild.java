import java.util.Scanner;

public abstract class Ajiochild extends Ajio{
    
    public void chooseCategory()
    {
        System.out.println("Choose for men, women.kids");
        Scanner sc=new Scanner(System.in);
        String category=sc.next();
    }

    public void chooseProduct()
    {
         System.out.println("Choose for Shirt,jeans,watches");
        Scanner sc=new Scanner(System.in);
        String category=sc.next();
    }

    public  void addToCart()
    {

    }
    public void quantity()
    {

    }
    public  void addSize()
    {

    }
    public  void addAddress()
    {

    }
}









