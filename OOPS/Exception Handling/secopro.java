import java.util.InputMismatchException;
import java.util.Scanner;
public class secopro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight");
        Double weight=sc.nextDouble();
        try{
        if(weight<0)
        {
            throw new InputMismatchException();
        }
    }
    catch(InputMismatchException e)
    {
        System.out.println("Enter positive number");
    }

    }
    
}
