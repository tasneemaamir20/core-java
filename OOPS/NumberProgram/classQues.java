public class classQues{

   
    public static int remDig(int n)
    {
        int m=1;
        while(n>0)
        {
            m=m*10;
             n=n/10;
            
        }
        return m;
    }

  
    public static boolean isAmorph(int n)
    {

       if(n == (n*n)%remDig(n)){
        return true;
       }
       else{
        return false;
       }

    }
    
    public static void main(String[] args) {
        int n = 25;
        boolean ans = isAmorph(n);
        System.out.println(ans);
    }
}