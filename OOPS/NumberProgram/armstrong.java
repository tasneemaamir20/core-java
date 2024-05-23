public class armstrong {

    public static int countDigit(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }


    public static int powerDigit(int n)
    {
        int k=countDigit(n);
        int m=1;
        for(int i=1;i<=k;i++)
        {
            int powr=n*n;
        }
        return powr;

    }
    public static boolean isArmstrong(int n)
    {
       int temp=n;
       int z=countDigit(n);
       int sum=0;
       while(n>0)
       {
        int id=n%10;
        int prod=1;
        for(int i=1;i<=z;i++)
        {
            prod=prod*id;

        }
        sum=sum+prod;
        n=n/10;
       }
       return sum==temp;
    }

    public static void main(String[]args)
    {
            System.out.println(isArmstrong(153));
    }
    
}
