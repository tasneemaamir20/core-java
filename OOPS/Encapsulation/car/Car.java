package car;
import java.util.Scanner;

public class Car {
    String brand , name;
    double mileage;

    Engine e;
    AC a;
    MP m;
    Tyre fl;
    Tyre fr;
    Tyre bl;
    Tyre br;


    {
        e=new Engine();
        a=new AC();
        fl=new Tyre("Apollo");
        fr=new Tyre("TVS");
        bl=new Tyre("mavheline");
        br=new Tyre("MRF"); 
    }
    

    public void demo()
    {
        System.out.println("Tarzan car");
    }

    public void insertMP(MP m)
    {
        if(m==null){
        this.m=m;
        System.out.println("Music player installed");
        }
        else{
            System.out.println("Music player already present");
        }

    }
    public void removeMP(MP m)
    {
        if(m!=null)
        {
            this.m =null;
            System.out.println("Music player removed ");
        }
        else{
            System.out.println("Music player doesn't exist");
        }
    }

    public Car(String brand, String name, double mileage)
    {
        this.brand=brand;
        this.name=name;
        this.mileage=mileage;
       
    }

    public Car (String brand, String name,double mileage,Engine e,AC a)
    {
        this.brand=brand;
        this.name=name;
        this.mileage=mileage;
        this.e=e;
        this.a=a;
    }
     public Car (String brand, String name,double mileage,Engine e,AC a,Tyre fl,Tyre fr,Tyre bl,Tyre br)
    {
        this.brand=brand;
        this.name=name;
        this.mileage=mileage;
        this.e=e;
        this.a=a;
        this.fl=fl;
        this.fr=fr;
        this.bl=bl;
        this.br=br;
    }


    public void removeTyre()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Which Tyre you want to remove");
        System.out.println("fl for 1,fr for 2,bl for 3,br for 4");
        int s=sc.nextInt();
        if(s==1)
        {
            this.fl=null;
            System.out.println("front left is removed");
        }
        else if(s==2)
        {
            this.fr=null;
            System.out.println("front right is removed");
        }
        else if(s==3)
        {
            this.bl=null;
            System.out.println("back left is removed");
        }
        else if(s==4)
        {
            this.br=null;
            System.out.println("back right is removed");
        }
        else{
            
        }
        
    }


    public void insertTyre()
    {
        Scanner st=new Scanner (System.in);
        int s1=sc.next();
        System.out.println("Which Tyre you want to insert");
        if(s==1)
        {
            this.fl=fl;
            System.out.println("front left is removed");
        }
        else if(s==2)
        {
            this.f2=f2;
            System.out.println("front right is removed");
        }
        else if(s==3)
        {
            this.bl=bl;
            System.out.println("back left is removed");
        }
        else if(s==4)
        {
            this.br=br;
            System.out.println("back right is removed");
        }
    }



}
