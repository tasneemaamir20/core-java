public class ComedyShow extends BookMyShow {
    String seleccomedian;
    String comedianName;
    int  seattype;
    int numseat;
    String seattypename;
    int Amount;
    char confiaddon;
    int chooseaddons;
    char sizeofaddons;
    int quantityofaddons;
    int quantityofaddonsnum;
    String chooseaddonsname;
    String whiskyname;
    public void Comedyshows()
    {
        
        System.out.println("Select your city:");
        System.out.println("Delhi  ||  Noida || Gurgaon");
        chooseCity=sc.next();
        
        if(chooseCity.equalsIgnoreCase("Delhi"))
        {
            System.out.println("Select the comedy show:");
            System.out.println(" Bassi  || Gaurav  || Akash  ");
            seleccomedian=sc.next();


            if(seleccomedian.equalsIgnoreCase("Bassi"))
            {
                comedianName=seleccomedian;
                selectSeat();
                addons();
            
            }
            else if(seleccomedian.equalsIgnoreCase("Gaurav"))
            {
                 comedianName=seleccomedian;
                  selectSeat();
                addons();
            }
              else if(seleccomedian.equalsIgnoreCase("Akash"))
            {
                 comedianName=seleccomedian;
                  selectSeat();
                addons();
            }
            else
            {
                 System.out.println("Invalid selection");
            }

        }
        else if(chooseCity.equalsIgnoreCase("Noida"))
        {
            System.out.println("Select the comedy show:");
            System.out.println("  Munawwar ||  Zakir  ");
            seleccomedian=sc.next();


            if(seleccomedian.equalsIgnoreCase("Munawwar"))
            {
                comedianName=seleccomedian;
                 selectSeat();
                addons();
            }
            else if(seleccomedian.equalsIgnoreCase("Zakir"))
            {
                comedianName=seleccomedian;
                 selectSeat();
                addons();
            }
        
            else
            {
                 System.out.println("Invalid selection");
            }

            // System.out.println("Bnaglore");
        }
        else if(chooseCity.equalsIgnoreCase("Gurgaon"))
        {
            System.out.println("Select the comedy show:");
            System.out.println("  Vijay ||  Anubhav   ");
            seleccomedian=sc.next();


            if(seleccomedian.equalsIgnoreCase("Vijay"))
            {
                comedianName=seleccomedian;
                 selectSeat();
                addons();
            }
            else if(seleccomedian.equalsIgnoreCase("Anubhav"))
            {
                comedianName=seleccomedian;
                 selectSeat();
                addons();
            }
        
            else
            {
                 System.out.println("Invalid selection");
            }

            // System.out.println("Mumbai");
        }
        else
        {
            System.out.println("Invalid Input");
        }

       
    }

// For selecting the seat
    public void selectSeat()
    {
        System.out.println("Select the seat:");
        System.out.println("Press 1 for VIP (2000) || Press 2 for Executive(1500)  || Press 3 for Normal (999) || Press 4 for stand(500)");
        seattype=sc.nextInt();
        
        System.out.println("How Many seat");
        numseat=sc.nextInt();

        if(seattype==1)
        {
            seattypename="VIP";
            Amount=Amount+(numseat*2000);
        }
        else if(seattype==2)
        {
            seattypename="Executive";
            Amount=Amount+(numseat*1500);

        }
        else if(seattype==3)
        {
            seattypename="Normal";
            Amount=Amount+(numseat*999);

        }
        else if(seattype==4)
        {
            seattypename="stand";
            Amount=Amount+(numseat*500);
        }
        else
        {
            System.out.println(" Wrong selection");
            selectSeat();
        }
    }



// For Addons

public void addons()
{
    System.out.println("Do you want to add Snacks: Y/N ");
    confiaddon=sc.next().charAt(0);
    if(confiaddon=='Y' || confiaddon=='y')
    {
        System.out.println("Select the Addons");
        System.out.println("press 1 for popcorn");
        System.out.println("press 2 for cold drink");
        System.out.println("press 3 for whisky");
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
            quantityofaddonsnum+=quantityofaddons;
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
            System.out.println("Which size do you want ot add ");
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
            System.out.println("Which whisky do you want :");
            System.out.println("Teachers  ||  Blender");
            whiskyname=sc.next();
            if(whiskyname.equalsIgnoreCase("Teachers"))
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
            else if(whiskyname.equalsIgnoreCase("Blender"))
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

    }   
    else    
    {
        System.out.println("Okay sir i skipped it");
    }

}




// For displaying the output

public void display()
{
    System.out.println("Location                : "+chooseCity);
    System.out.println("Comedian Name           : "+comedianName);
    System.out.println("Seat Type name          : "+seattypename);
    System.out.println("Addons                  : "+chooseaddonsname);
    System.out.println("Quantity of addons      : "+quantityofaddons);
    System.out.println("Total price             : "+Amount);

}
    
}
