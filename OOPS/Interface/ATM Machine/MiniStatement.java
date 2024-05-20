public class MiniStatement {

    private double amt;
    private String msg;
    private double curbal;

    MiniStatement()
    {

    }

    MiniStatement(double amt,String msg,double curbal)
    {
        this.amt=amt;
        this.msg=msg;
        this.curbal=curbal;

    }

    public double getAmt()
    {
        return this.amt;
    }

    public void setAmt(double amt)
    {
        this.amt=amt;        
    }

    public String getMsg()
    {
        return this.msg;
    }

    public void setMsg(String msg)
    {
        this.msg=msg;
    }

    public double getCurbal()
    {
        return this.curbal;
    }

    public void setCurbal(double amt)
    {
        this.curbal +=amt;
    }


    public void details()
    {
        System.out.println(amt+" "+msg+" "+curbal);
    }
    
}
