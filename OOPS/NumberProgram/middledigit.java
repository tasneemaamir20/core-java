public class middledigit{
    public static int numberCount(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
    public static int middledig(int n)
    {
        int m=numberCount(n);
        if(m%2==1)
        {
            for(int i=0;i<m/2;i++)
            {
                n=n/10;
            }
            return n%10;
        }
        else{
            return 0;
        }
        }
        public static void main(String[]args)
        {
            System.out.println(middledig(12345));
        }
    
}