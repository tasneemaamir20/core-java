public class Employees {
    private int id;
    private String name;
    private double sal;
    private double comm;
    private int numOfPl;
    int count=0;

    public Employees()
    {

    }
    public Employees(int id,String name, double sal, double comm, int numOfPl)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
        this.comm=comm;
        this.numOfPl=numOfPl;
    }
    public int setId()
    {
        return id;
    }
    
    public  void countId(int n)
    {   
        int count=0;
        while(n>0)
        {   
            count++;
            id=id/10;

        }
        return count;
    }
    public void setId(int id)
    {
        if(count==4 && id%2==0)
        {
            this.id=id;
        }
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
       this.name=name;
    }
    public int getSal()
    {
        return sal;
    }
    public void setSal(double sal)
    {
        if(sal>=0 && sal<=5000)
        {
            this.sal=sal;
        }
        else{
            System.out.println("Sal is not between 0 to 5000");
        }
    }
    
    public int getComm()
    {
        return comm;
    }
    public void setComm(double comm)
    {
        if(comm<sal)
        {
            this.comm=comm;
        }
        else{
            System.out.println("commission in more than salary");
        }
    }
    public int getNumOfPl()
    {
        return numOfPl;
    }
    public void setNumOfPl(int numOfPl)
    {
        if(numOfPl>0 && numOfPl<30)
        {
            this.numOfPl=numOfPl;
        }
    }

}
