import javax.xml.transform.Source;

public class Bank
{
    String name;
    char gender;
    int age;
    int mobno;
    double balance;
    int count;

    void  getinterest()
    {
        this.balance=balance*2.5;
    }
    // for count the phone number 
    public int countDigit(int mobno)
    {
        
        while(mobno>0)
        {
           count++;
           mobno=mobno/10; 
        }
        return count;
    }

public Bank()
{

}

// public Bank(String name,char gender,int age,int mobno,double balance)
// {
    
//         this.name=name;

//         // for gender
//         if(gender=='M' || gender=='m' || gender=='f' || gender=='F')
//         {
//         this.gender=gender;
//         }
//         // for age
//         if(age>=15 && age<=80)
//         {
//             this.age=age;
//         }
//         // for mobile number
//         if(countDigit(mobno)==6 && mobno%2==0)
//         {
//         this.mobno=mobno;
//         }
//         {
//             System.out.println("Enter the correct phone number that should be 6 character and even number");
//         }
//         // for balance
//         if(balance>0)
//         {
//         this.balance=balance;
//         }
//         else
//         {
//             System.out.println("Enter  some positive values");
//         }
// }


    // for printing full details
     void getDetails(String name,char gender,int age,int mobno,double balance)
    {
       
        this.name=name;
          System.out.println("The Bank name is:- "+name);

        // for gender
        if(gender=='M' || gender=='m' || gender=='f' || gender=='F')
        {
        this.gender=gender;
         System.out.println("Gender :- "+gender);
        }
        // for age
        if(age>=15 && age<=80)
        {
            this.age=age;
             System.out.println("Age:- "+age);
        }
        // for mobile number
        if(countDigit(mobno)==6 && mobno%2==0)
        {
        this.mobno=mobno;
         System.out.println("Mobile number :- "+mobno);
        }
        {
            System.out.println("Enter the correct phone number that should be 6 character and even number");
        }
        // for balance
        if(balance>0)
        {
        this.balance=balance;
        System.out.println("Balance:- "+balance);
        }
        else
        {
            System.out.println("Enter  some positive values");
        }
     
      if(b instanceof ICICI)
      {
        
      }
      
      
       
    }
    
}