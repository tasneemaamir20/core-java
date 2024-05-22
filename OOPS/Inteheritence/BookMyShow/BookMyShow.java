import java.util.*;

import javax.swing.SpringLayout;


public class BookMyShow
{
    boolean login=false;
    String emailid,pwd,logemailid,logpwd;
    String chooseCity;
    int choice;
    String selectCinema;
    Scanner sc=new Scanner(System.in);




    // For Performing all
    public void registration()
    {
        System.out.println("Do yoy have account?y/n");
        char takeregistration=sc.next().charAt(0);

        if(takeregistration=='y' || takeregistration=='Y')
        {
             login();
        }
        else
        {
            signup();
            login();
            citySelection();
        }
    
    }


    

    // For Signup page
    public void signup()
    {
        System.out.println("Create new account");
        System.out.println("Enter the email id");
        emailid=sc.next();
        System.out.println("Enter the password");
        pwd=sc.next();
    }

    // for login page
    public void login()
    {
        System.out.println("do you have a account ? Y/N");
        char accountexist=sc.next().charAt(0);
        if(accountexist=='y' || accountexist=='Y')
        {
            System.out.println("login to the account");
            System.out.println("Enter the email id");
            logemailid=sc.next();
            System.out.println("Enter the password");
            logpwd=sc.next();
            if(logemailid.equals(emailid) || pwd.equals(logpwd))
            {
                System.out.println("Login Succresfull");
                login=true;

            }
            else
            {
            if(logemailid!=emailid && logpwd!=pwd)
                System.out.println("Incorrect email , password");
            else if(logpwd!=pwd)
                System.out.println("Incorrect password");
            else if(logemailid!=emailid)
                System.out.println("Incorrect email id");
            }
        }
        else if(accountexist=='n'|| accountexist=='N')
        {
            signup();
            login();
        }
        else
        {
            System.out.println("Invalid input !!!");
        }
    }




    // for choosing the movie/comedy shew/concerts

    public void selection()
    {
        System.out.println("Enter the choice:");
        System.out.println("Press 1 for movies   ||  Press 2 for comedy show     ||  Press 3 for live concerts");
        choice=sc.nextInt();

        if(choice==1)
        {
            
            // System.out.println("Select movies");
        }
        else if(choice==2)
        {
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



// For selecting the city

    public void citySelection()
    {
        System.out.println("Select your city:");
        System.out.println("Delhi  ||  Banglore  || Mumbai");
        chooseCity=sc.next();
        
        if(chooseCity.equalsIgnoreCase("Delhi"))
        {
            // System.out.println("Delhi");
        }
        else if(chooseCity.equalsIgnoreCase("Banglore"))
        {
            // System.out.println("Bnaglore");
        }
        else if(chooseCity.equalsIgnoreCase("Mumbai"))
        {
            // System.out.println("Mumbai");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    
    }



    // For selecting cinema

    public void cinemaSelection()
    {
        System.out.println("choose you cinema:");
        System.out.println("PVR superflex mall  || INOX Phenix plasoio  ||  IMAX  lulu mall");
        selectCinema=sc.next();

        if(selectCinema.equalsIgnoreCase("PVR"))
        {

        }
        else if(selectCinema.equalsIgnoreCase("INOX"))
        {

        }
        else if(selectCinema.equalsIgnoreCase("IMAX"))
        {

        }
        else
        {

        }

    }

}