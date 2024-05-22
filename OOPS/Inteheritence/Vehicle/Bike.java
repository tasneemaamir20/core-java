public class Bike extends Vehicle
{
    int numoftyre;

    
    void wheelly()
    {
        System.out.println("boom boom");
    }
    void vehicleDetails()
    {
        System.out.println("the brand of a vehicle is: "+brand);
        System.out.println("The name of a vahicle is: "+name);
        System.out.println("The Price of vehicle is: "+price);
        System.out.println("The mileage of a  vehicleis: "+mileage);
        System.out.println("The engine number of a vehicle is: "+engineno);
    }
    public Bike(int price ,int engineno,double mileage,String brand,String name,int numoftyre)
    {
        super(price, engineno, mileage, brand, name);
        this.numoftyre=numoftyre;
    }

    public Bike(){
        
    }

    
}