class primeNum
{
    public static boolean primeNumber(int n)
    {
        boolean m=true;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                m=false;
                break;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=n;i++)
        {
            boolean ans=primeNumber(i);
            if(ans==true)
            {
                System.out.print(i +" ");
            }
        }
    }
}