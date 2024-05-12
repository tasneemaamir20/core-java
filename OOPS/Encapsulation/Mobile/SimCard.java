package Mobile;

public class SimCard {
    
    String operator;
    double balance;


    public SimCard()
    {

    }
    public SimCard(double balance)
    {
        this.balance=balance;
    }
     public SimCard(String operator,double balance)
    {
        this.operator=operator;
        if(balance>0 && balance <500)
        {
        this.balance=balance;
        }
        else{
            System.out.println("out of range");
        }
    }

    public void calling()
    {
        System.out.println("calling");
    }
    void details()
    {
        System.out.println(balance);
        System.out.println(operator);
    }
    
}
