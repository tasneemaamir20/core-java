package car;

public class AC {
    double temp;
    // Constructor 1 no argument
    public AC()
    {

    }
    // constructor 2 with 1 argument
    public AC(double temp)
    {
        if(temp<=16)
        {
        this.temp=16;
    }
    else if(temp>=28)
    {
        this.temp=28;
    }
    else
    {
        this.temp=temp;
    }
    }
    public void incTemp()
    {
        if(temp>=28)
        {

        }
        else{
        temp +=0.1;
        }
    }
    public void decTemp()
    {
        if(temp<=16)
        {
        temp -=0.1;
        }
        else
        {

        }
    }
}
