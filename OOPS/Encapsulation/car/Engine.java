package car;



public class Engine {
    int hp;
    // Constructor Start 1
    public Engine()
    {
        
    }

    public Engine(int hp)
    {
        this.hp=hp;
    }
    public void startEngine()
    {
        System.out.println("krr klrr krr");
    }

    public void stopEngine()
    {
        System.out.println("brr brr brr");
    }
}
