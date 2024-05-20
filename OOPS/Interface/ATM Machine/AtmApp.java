
import java.util.Scanner;

import javax.xml.transform.Source;

public class AtmApp implements ATMinterface {
    Scanner sc=new Scanner(System.in);
    private int bal=50000;
    private int pin=7860;
    MiniStatement [] m = new MiniStatement[5];
    int x=0;
    
    public  int getPin()
    {
        return pin;
    }

    
    public void setPin( int a ){
        this.pin = a;
    }


    public void Withdrawl()
    {
        System.out.println("Enter the amount you want to withdraw");
        int withAmout=sc.nextInt();
        if(withAmout<25000 && withAmout%10==0 &&withAmout<=this.bal&&withAmout>0)
        {
        System.out.println(withAmout+" Money withdrawl successfull");
        bal=bal-withAmout;
        System.out.println("Remianing balance :"+bal);
        MiniStatement m1=new MiniStatement(withAmout,"Amount credited",bal);
        if(x<5)
        {
            m[x]=m1;
            x++;
        }
        else{
            for(int i=0;i<4;i++)
            {
                m[i]=m[i+1];
            }
            m[m.length-1]=m1;
        }
        }
        else{
            System.out.println("Invalid amount entered");
        }
    }


    public void getBalance()
    {
        System.out.println("your balance :"+bal);
    }


    public void deposit()
    {
        System.out.println("Enter amount you want to deposit");
        int depAmount=sc.nextInt();
        if(depAmount<=40000)
        {
            bal+=depAmount;
        System.out.println("money deposited successfull!!! "+depAmount);
        System.out.println(" Your balance "+(bal+depAmount));

        MiniStatement m1=new MiniStatement(depAmount,"Amount debited", bal);
        if(x<5)
        {
            m[x]=m1;
            x++;
        }
        else
        {
            for(int i=0;i<4;i++)
            {
                m[i]=m[i+1];
            }
            m[m.length-1]=m1;
        }
        }
        else
        {
            System.out.println("You can not deposit more 40000 at a time");
        }
    }

    public void changePin()
    {
        System.out.println("Enter your current PIN");
        int CurrPin=sc.nextInt();
        if(CurrPin==this.pin)
        {
            System.out.println("Enter the new PIN");
            int newPin=sc.nextInt();
            int temp=newPin;
            int count=0;
            while(temp>0)
            {
                count++;
                temp/=10;
            }
            if(count==4)
            {
                this.pin=newPin;
                System.out.println("PIN Successfully changed!!!");
            }
            else
            {
                System.out.println("please Enter 4 digit PIN");
            }
        }
        else{
            System.out.println("Please Enter correct Current PIN");
        }
        

    }

    
    public void miniStatement()
    {
        System.out.println("============================");
        int index=1;
        for(int i=m.length-1;i>=0;i--)
        {
            if(m[i]!=null)
            {
                System.out.print(index +".  ");
                m[i].details();
                index++;
            }
        }
        System.out.println("===============================");
    }




      
}
