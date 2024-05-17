import java.io.IOException;
import java.util.Scanner;
public class customExcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your for marriage");
        int age=sc.nextInt();
        
        try{
        if(age<18)
        {
            throw new AgeException("Too young for marriage");

        }
        else if(age>60)
        {
            throw new AgeException("Too old for marriage");
        }
    }
    catch(IOException e){
        System.out.println("you are not eligible");
    }
        
    }

}
