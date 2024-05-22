

public class Truck extends Vehicle {

    int numofdriver;
    void listContainer()
    {
        System.out.println("hurr hurr hurr");
    }
    void vehicleDetails()
    {
        System.out.println("the brand of a vehicle is: "+brand);
        System.out.println("The name of a vahicle is: "+name);
        System.out.println("The Price of vehicle is: "+price);
        System.out.println("The mileage of a  vehicleis: "+mileage);
        System.out.println("The engine number of a vehicle is: "+engineno);
    }
    public Truck(int price ,int engineno,double mileage,String brand,String name,int numofdriver)
    {
        super(price, engineno, mileage, brand, name);
        this.numofdriver=numofdriver;
    }
    public Truck()
    {

    }
    }

