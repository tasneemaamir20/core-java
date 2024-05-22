

public class Car extends Vehicle{
    int numofseat;

    void Drift()
    {
        System.out.println("Drift trr trr trrr");
    }
   
    void vehicleDetails()
    {
        System.out.println("the brand of a vehicle is: "+brand);
        System.out.println("The name of a vahicle is: "+name);
        System.out.println("The Price of vehicle is: "+price);
        System.out.println("The mileage of a  vehicleis: "+mileage);
        System.out.println("The engine number of a vehicle is: "+engineno);
    }
        public Car (int price ,int engineno,double mileage,String brand,String name,int  numofseat)
        {
            super(price, engineno, mileage, brand, name);
            this.numofseat=numofseat;
        }
        public Car()
        {

        }
}
