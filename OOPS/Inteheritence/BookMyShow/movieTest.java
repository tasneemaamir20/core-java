import java.util.Scanner;

public class movieTest  {
  
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          
        //     BookMyShow b=new BookMyShow();
        //    b.registration();
        // Movies m=new Movies();
        // m.watchMovie();
        // ComedyShow c=new ComedyShow();
        // c.Comedyshows();

        // System.out.println("__________________________");
        // c.display();
        
        // System.out.println("_______________________________");
        // // m.Display();
        // System.out.println("_______________________________");

        BookMyShow b=new BookMyShow();
        b.registration();

    // for choosing the movie/comedy shew/concerts

    
        System.out.println("Enter the choice:");
        System.out.println("Press 1 for movies   ||  Press 2 for comedy show     ||  Press 3 for live concerts");
        int choose=sc.nextInt();

        if(choice==1)
        {
            Movies m=new Movies();
            m.watchMovie();
            // System.out.println("Select movies");
        }
        else if(choice==2)
        {
            ComedyShow c=new ComedyShow();
            c.Comedyshows();
            // System.out.println("Select comedy show");
        }
        else if(choice==3)
        {
            // System.out.println("select concerts");
        }

        else{
            System.out.println("Invalid Input");
        }
    }


        


    }
}
