public class VehicleTest {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.brand="kavasaki";
        b.engineno=12345;
        b.name="ninja";
        b.price=2500000;
        b.numoftyre=22;
        b.mileage=12.5;
        b.vehicleDetails();
        System.out.println("_________________________________");
        Car c=new Car();
        c.brand="Mercedes";
        c.engineno=87655;
        c.name="Maybach";
        c.price=25000000;
        c.numofseat=2;
        c.mileage=12.5;
        c.vehicleDetails();
        System.out.println("__________________________________");
        Bike b2=new Bike();
        b2.brand="kavasaki";
        b2.engineno=12345;
        b2.name="ninja";
        b2.price=2500000;
        b2.numoftyre=2;
        b2.mileage=12.5;
        b2.vehicleDetails();
        System.out.println("___________________________________");
        Truck t=new Truck();
        t.brand="Truck";
        t.engineno=12345;
        t.name="Ashosk Leyland";
        t.price=2500000;
        t.numofdriver=2;
        t.mileage=12.5;
        t.vehicleDetails();
    }
}
