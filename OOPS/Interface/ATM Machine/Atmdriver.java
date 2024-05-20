import java.util.*;

public class Atmdriver {
    public static void main(String[] args) {
        boolean flag=true;
    
        Scanner sc=new Scanner(System.in);
        AtmApp a=new AtmApp();
        System.out.println("Enter the pin");
        int pinnum=sc.nextInt();
       
        if(pinnum==a.getPin())
        {
             while(flag)
            {
                System.out.println("Choose option:");
                System.out.println("Press 1 for Withdrawl");
                System.out.println("Press 2 for Balance inquiry");
                System.out.println("Press 3 for Deposit money");
                System.out.println("Press 4 for Change the pin");
                System.out.println("Press 5 for Ministatement");
                System.out.println("Press 6 for Exit");

                int choice=sc.nextInt();
                if(choice==1)
                {
                    a.Withdrawl();
                }
                else if(choice==2)
                {
                    a.getBalance();
                }
                else if(choice==3)
                {
                    a.deposit();
                }
                else if(choice==4)
                {
                    a.changePin();
                }
                else if(choice==5)
                {
                    a.miniStatement();
                }
                else if(choice==6)
                {
                    System.out.println("Exit!!!");
                    flag=false;
                }

            }
            
        }
        else
        {
                System.out.println("Wrong PIN!!! please Enter valid PIN");

        }
    }   
}   
