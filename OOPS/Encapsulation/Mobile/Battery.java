package Mobile;
public class Battery {
    

    int mAH;

    public Battery()
    {

    }
    public Battery(int mAH)
    {
        
        this.mAH=mAH;
    }
    void details()
    {
        System.out.println("Battery :"+mAH);
    }
    public void charging()
    {
        System.out.println("phone charge");
    }
    public void disCharge()
    {
        System.out.println("phone discharge");
    }









}
