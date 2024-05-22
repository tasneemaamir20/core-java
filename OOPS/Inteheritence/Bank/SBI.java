import javax.sound.sampled.SourceDataLine;

public class SBI extends Bank
{
    String branch;
    String ifsc;
    int mobno;
   void getinterest()
    {
        this.balance=balance*2.7;
    }

   public SBI(String name,char gender,int age,double balance, String branch,String ifsc,int mobno)
    {
         super( name, gender,age,balance);
         this.branch=branch;
         this.ifsc=ifsc;
       
         if(countDigit(mobno)==6 && mobno%2!=0)
         {
          this.mobno=mobno;
         }
    }

   public SBI()
   {

   }


    // void getDetails()
    // {
       
    //    System.out.println("The Bank name is:- "+name);
    //    System.out.println("Gender :- "+gender);
    //    System.out.println("Age:- "+age);
    //    System.out.println("Mobile number :- "+mobno);
    //    System.out.println("Balance:- "+balance);
    // }
}