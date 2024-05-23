
public class movies
{
    String name,actor,actress;

    static
    {
        System.out.println("this is static initializer");
    }
    {
        System.out.println("this is non static initializer");
    }
    public static void demo()
    {
        System.out.println("this is demo method");
    }
    public void detail()
    {
        System.out.println(name);
        System.out.println(actor);
        System.out.println(actress);
    
    }
    movies()
    {
        demo();
        actor="SRK";
        detail();

    }
    public static void main(String[]args)
    {
        System.out.println("main method start");
        movies m1=new movies();
       
        movies m2=new movies();
        System.out.println("main method ends");
    }
}