package car;


public class Test {
     public static void main(String[] args) {
          
    
     Car c=new Car("mercedes","Maybach",12);
     
    System.out.println(c.brand);
    System.out.println(c.name);
    System.out.println(c.mileage);
    c.demo();


    System.out.println(c.e.hp);
    c.e.startEngine();
    c.e.stopEngine();




    System.out.println(c.a.temp);
    c.a.incTemp();
    System.out.println(c.a.temp);
    c.a.decTemp();
    System.out.println(c.a.temp);



    c.insertMP(new MP());
    System.out.println(c.m.brand);
    c.m.playMusic();

     c.removeMP(new MP());
    System.out.println(c.m.brand);
    c.m.playMusic();

    System.out.println("____________________");

    Car c2=new Car("toyota","fortuner",15,new Engine(2000),new AC(16));
         System.out.println(c.brand);
         System.out.println(c.brand);
         System.out.println(c.brand);
        c2.demo();


        System.out.println(c2.e.hp);
        c2.e.startEngine();
        c2.e.stopEngine();


        System.out.println(c2.a.temp);
        c2.a.incTemp();
        System.out.println(c2.a.temp);
        c2.a.decTemp();
        System.out.println(c2.a.temp);




     Car c3=new Car("toyota","fortuner",15,new Engine(2000),new AC(16),new Tyre("Apollo"),new Tyre("MRF"),new Tyre("Ceat"),new Tyre("TVS"));

     c3.removeTyre();
     System.out.println(c3.fl.brand);
 }
}
