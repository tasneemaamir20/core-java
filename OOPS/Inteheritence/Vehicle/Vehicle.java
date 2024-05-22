public class Vehicle
{
    int price ,engineno;
    double mileage;
    String brand, name;
    void startEngine()
    {
        System.out.println("engine is starting");
    }
    void stopEngine()
    {
        System.out.println("engine is stop");
    }

public Vehicle(int price ,int engineno,double mileage,String brand,String name)
{
    this.price=price;
    this.engineno=engineno;
    this.mileage=mileage;
    this.brand=brand;
    this.name=name;
    
}

public Vehicle(){

}
   
}