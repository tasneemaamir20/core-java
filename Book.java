class Book{
    static String name="Central library";
    String bname;
    String author;
    int price;
    public static  void entry()
    {
        System.out.println("enter through front door");
    }
    public static void exit()
    {
        System.out.println("exit through back door");
    }
    public void display()
    {
        System.out.println("the name of book"+bname);
        System.out.println("the name of author"+author);
        System.out.println("the price"+price);
    }
    public void read()
    {
        System.out.println("he is reading"+bname+"book");
    }
    static
    {
        System.out.println("this is static initializer");
    }
    {
        System.out.println("this is non static initializer");
    }
    public void display2()
    {
        System.out.println("the name of book"+bname);
        System.out.println("the name of author"+author);
        System.out.println("the price"+price);
    }
    public static void main(String[]args)
    {
        Book b1=new Book();
        b1.display();
        b1.read();
        b1.bname="FIRE AND BLOOD";
        b1.author="RK Martin";
        b1.price=250;
         b1.display();
        b1.read();
        b1.display2();

        // Book b2=new Book();
        // Book b3=new Book();

       

        // b2.bname="HALF GIRLFRIEND";
        // b2.author="CHETAN BHAGAT";
        // b2.price=200;

        // b3.bname="ATOMIC HABITS";
        // b3.author="JAMES CLEAR";
        // b3.price=300;


        
    }


}