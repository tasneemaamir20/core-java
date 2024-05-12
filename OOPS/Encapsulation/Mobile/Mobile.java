package Mobile;

import java.util.Scanner;


public class Mobile {
    String brand;
    String name;
    int price;

    Battery b;
    SimCard sim1;
    SimCard sim2;
     Scanner sc=new Scanner(System.in);
    {

        b=new Battery();
        sim1=new SimCard();
        sim2=new SimCard();
    }

    public Mobile()
    {

    }
    
    public Mobile(String brand, String name,int price)
    {
        this.brand=brand;
        this.name=name;
        this.price=price;

    }
    public Mobile( String brand,String name,int price,Battery b,SimCard sim1,SimCard sim2)
    {
        this.brand=brand;
        this.name=name;
        this.price=price;
        this.b=b;
        this.sim1=sim1;
        this.sim2=sim2;
    }

// For displaying full details
        public void fullDetail()
        {
            System.out.println(brand);
            System.out.println(name);
            System.out.println(price);
            
            if(b!=null)
            {
            b.details();
            }else{
                System.out.println("Battery not exist");
            }
            if(sim1!=null)
            {
                sim1.details();
            }
            else{
                System.out.println("SIM1 doesn't exist");
            }
             if(sim2!=null)
            {
                sim2.details();
            }
            else{
                System.out.println("SIM2 doesn't exist");
            }

        }










// for inserting the simcard
    void insertSimCard()
    {
        System.out.println("which slot you want to insert");

        System.out.println("for (slot 1) press 1 or for (slot 2) press 2");
        int slot=sc.nextInt();
        System.out.println("enter the name for");
        String Simname=sc.next();
        System.out.println("enter the balance");
        int simbalance=sc.nextInt();

        if(slot==1)
        {
            if(sim1==null)
            {
                // sim1=new SimCard(Simname,simbalance);
                this.sim1=new SimCard(Simname, simbalance);
                System.out.println("sim card inserted");
            }
            else
            {
                System.out.println("SIM already exist");
            }
        }
        else if(slot==2)
        {
            if(sim2==null)
            {
                sim2=new SimCard(Simname, simbalance);
                System.out.println("SIm card inserted");
            }
            else
            {
                System.out.println("SIM already exist");
            }
        }
        else
        {
            System.out.println("Enter valid choice");
        }


    }


    // for removing the SIM card
    void removeSimCard()
    {
        System.out.println("which slot you want to remove");

        System.out.println("for (slot 1) press 1 or for (slot 2) press 2");
        int slot=sc.nextInt();
       

        if(slot==1)
        {
            if(sim1!=null)
            {
                this.sim1=null;
                System.out.println("sim card removed");
            }
            else
            {
                System.out.println("SIm card not present");
            }
        }
        else if(slot==2)
        {
            if(sim2!=null)
            {
                this.sim2=null;
                System.out.println("SIm card removed");
            }
            else
            {
                System.out.println("Sim card not present");
            }
        }
        else
        {
            System.out.println("Enter valid choice");
        }

    }





}
