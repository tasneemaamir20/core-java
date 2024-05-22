

public class Movies extends BookMyShow {
    
// sir wala
    int Amount;
    int chooseaddons;
    int movie;
    int seattype;
    int numseat;
    char confiaddon;
    char sizeofaddons;
    int quantityofaddons;
    int quantityofaddonsnum;
    String moviename;
    String seattypename;
    String  chooseaddonsname;


    // For movies selection
    public void watchMovie()
    {
        
        System.out.println("Enter the language choice");
        System.out.println("Enter 1 for Hollywood  || Enter 2 for Bollywood  || Enter 3 for Tamil");
        int choice=sc.nextInt();

        if(choice==1)
        {
           Hollywood();
           selectSeat();
           addons();
        }
        else if(choice==2)
        {
            Bollywood();
            selectSeat();
            addons();
        }
        else if(choice==3)
        {
            tamilmovie();
            selectSeat();
            addons();
        }
    }


    public void Hollywood()
    {
        System.out.println("Select the movies");
        System.out.println("press 1 for Fast X");
        System.out.println("press 1 for robot");
        System.out.println("press 1 for Aqua man");
        movie=sc.nextInt();

        if(movie==1)
        {
            numseat=1;
            moviename="Fast X x  "+numseat;
            System.out.println("watching Fast X ");
        }
        else if(movie==2)
        {
            numseat=2;
            moviename="Robot x"+numseat;
            System.out.println("watching robot");
        }
        else if(movie==3)
        {
             numseat=3;

             moviename="Aqua x "+numseat;
            System.out.println("watching Aqua man");
        }
        else
        {
        System.out.println("sorryyyy !!! this movie is not in cinema ");
        }
    }

    // For Bollywood movies
    public void Bollywood()
    {
        System.out.println("Select the movies");
        System.out.println("press 1 for Jawan");
        System.out.println("press 2 for Fukrey");
        System.out.println("press 3 for  Ganapath");
        movie=sc.nextInt();

        if(movie==1)
        {
            numseat=1;
            moviename="Jawan x "+numseat;
            System.out.println("watching Jawan  ");
        }
        else if(movie==2)
        {
            numseat=2;
            moviename="Fukrey 3 x "+numseat;
            System.out.println("watching Fukrey");
        }
        else if(movie==3)
        {
            numseat=3;
            moviename="Ganapath x "+numseat;
            System.out.println("watching Ganapath man");
        }
        else
        {
            System.out.println("sorryyyy !!! this movie is not in cinema ");
        }
    }

    // For Tamil movies
    public void tamilmovie()
    {
        System.out.println("Select the movies");
        System.out.println("press 1 for Leo ");
        System.out.println("press 1 for Jailer");
        System.out.println("press 1 for  Varishu");
        movie=sc.nextInt();
        if(movie==1)
        {
            numseat=1;
            moviename="Leo x "+numseat;
            System.out.println("watching Leo X ");
        }
        else if(movie==2)
        {
            numseat=2;
            moviename="Jailer x "+numseat;
            System.out.println("watching Jailer");
        }
        else if(movie==3)
        {
            numseat=3;
            moviename="varishu x "+numseat;
            System.out.println("watching Varishu");
        }
        else
        {
            System.out.println("sorryyyy !!! this movie is not in cinema ");
        }
    }



// for selecting the seat 

    public void selectSeat()
    {
        System.out.println("Select the seat:");
        System.out.println("1---> Normal || 2--> Premium  || 3-->Recliner");
        seattype=sc.nextInt();
        
        System.out.println("How Many seat");
        numseat=sc.nextInt();
        if(seattype==1)
        {
            seattypename="Normal";
            Amount=Amount+(numseat*200);
        }
        else if(seattype==2)
        {
            seattypename="Premium";
            Amount=Amount+(numseat*300);

        }
        else if(seattype==3)
        {
            seattypename="Recliner";
            Amount=Amount+(numseat*600);

        }
        else
        {
            System.out.println(" Wrong selection");
            selectSeat();
        }
    }

// for selecting addons

public void addons()
{
    System.out.println("Do you want to add: Y/N ");
    confiaddon=sc.next().charAt(0);
    if(confiaddon=='Y' || confiaddon=='y')
    {
        System.out.println("Select the Addons");
        System.out.println("press 1 for popcorn");
        System.out.println("press 2 for cold drink");
        System.out.println("press 3 for Nachos");
        chooseaddons=sc.nextInt();
        if(chooseaddons==1)
        {
            System.out.println("Which size do you want ot add");
            System.out.println("for small ---> press S");
            System.out.println("for medium---> press M");
            System.out.println("for large----> press L");
            sizeofaddons=sc.next().charAt(0);
            System.out.println("Select the quantity");
            quantityofaddons=sc.nextInt();
            quantityofaddonsnum+=quantityofaddonsnum;
            chooseaddonsname="Popcorn * "+this.quantityofaddonsnum;
            // for Small selection
            if(sizeofaddons=='S' || sizeofaddons=='s')
            {
                Amount=Amount+(quantityofaddons*150);
            }
            else if(sizeofaddons=='M' || sizeofaddons=='m')
            {
                Amount=Amount+(quantityofaddons*250);

            }
            else if(sizeofaddons=='L' || sizeofaddons=='l')
            {
                 Amount=Amount+(quantityofaddons*350);

            }
            else
            {
                System.out.println("please enter valid input");
            }
        }

        // for medium selection
        else if(chooseaddons==2)
        {
            System.out.println("Which size do you want ot add");
            System.out.println("for small ---> press S");
            System.out.println("for medium---> press M");
            System.out.println("for large----> press L");
            sizeofaddons=sc.next().charAt(0);
            System.out.println("Select the quantity");
            quantityofaddons=sc.nextInt();
            quantityofaddonsnum=2;
            chooseaddonsname="Cold Drink * "+quantityofaddonsnum;
            if(sizeofaddons=='S' || sizeofaddons=='s')
            {
                Amount=Amount+(quantityofaddons*150);
            }
            else if(sizeofaddons=='M' || sizeofaddons=='m')
            {
                Amount=Amount+(quantityofaddons*250);

            }
            else if(sizeofaddons=='L' || sizeofaddons=='l')
            {
                 Amount=Amount+(quantityofaddons*350);

            }
            else
            {
                System.out.println("please enter valid input");
            }
        }

        // for large selection
        else if(chooseaddons==3)
        {
            System.out.println("Which size do you want ot add");
            System.out.println("for small ---> press S");
            System.out.println("for medium---> press M");
            System.out.println("for large----> press L");
            sizeofaddons=sc.next().charAt(0);
            System.out.println("Select the quantity");
            quantityofaddons=sc.nextInt();
            quantityofaddons=3;
            chooseaddonsname="Nachos * "+this.quantityofaddons;

            if(sizeofaddons=='S' || sizeofaddons=='s')
            {
                Amount=Amount+(quantityofaddons*150);
            }
            else if(sizeofaddons=='M' || sizeofaddons=='m')
            {
                Amount=Amount+(quantityofaddons*250);

            }
            else if(sizeofaddons=='L' || sizeofaddons=='l')
            {
                 Amount=Amount+(quantityofaddons*350);

            }
            else
            {
                System.out.println("please enter valid input");
            }
        }

    }
    else
    {
        System.out.println("Okay sir i skipped it");
    }

}


// display the output

public void Display()
{
    System.out.println("Movie name         :  "+this.moviename);
    System.out.println("seat Type          :  "+this.seattypename);
    System.out.println("Number of seat     :  "+this.numseat);
    System.out.println("Addons             :  "+this.chooseaddonsname);
    System.out.println("Size of addons     :  "+this.sizeofaddons);
    System.out.println("Quantity of Addons :  "+ this.quantityofaddons);
    System.out.println("Total price        :  "+this.Amount);

}


}
