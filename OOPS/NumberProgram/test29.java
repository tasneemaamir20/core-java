import java.util.Scanner;

public class test29{



    // Q1. WAJP to find whether the number is palindrome or not 

        // public static boolean isPalidrome(int n)
        // {
        //     int temp=n;
        //     int sum=0;
        //     while(n>0)
        //     {
        //         int ls=n%10;
        //         sum=(sum*10)+ls;
        //         n=n/10;
        //     }
        //     return sum==temp;
        // }

        // public static void main(String[] args) {
        //  System.out.println(isPalidrome(12321));
        // }
















    // Q2. WAJP to find whether the number is Strong number or not 
        // STRONG : Sum of factorial of a digit of a number is equal to the  number itself 

           
    //     public static boolean isStrongNumber(int n)
    //     {
    //         int temp=n;
    //          int sum=0;
    //         while(n>0)
    //         {
    //             int ls=n%10;
    //             int fact=1;
    //              for(int i=1;i<=ls;i++)
    //              {
    //                 fact=fact*i;
    //              }
    //              sum=sum+fact;
    //              n=n/10;
                 
    //          }
    //          return sum==temp;
    // }


    //     public static void main(String[] args) {
    //         System.out.println(isStrongNumber(40585));
    //     }


























    // Q3. WAJP to find wheterh the number is armstrong number or not  
    // public static int countDigit(int n)
    // {
    //     int count=0;
    //     while(n>0)
    //     {
    //         count++;
    //         n=n/10;
    //     }
    //     return count;
    // }


    // public static boolean isArmstrong(int n)
    // {
    //     int temp=n;
    //     int x=countDigit(n);
    //     int sum=0;
    //     while(n>0)
    //     {
    //         int l=n%10;
    //         int m=1;
    //          for(int i=0;i<x;i++)
    //     {
            
    //         m=m*l;
    //     }
    //     sum=sum+m;
    //     n=n/10;

    //     }
    //     return sum==temp;


       
    // }


    // public static void main(String[] args) {
    //     System.out.println(isArmstrong(153));
    // }




    // Q4. WAJP to find whether the number is automorphic number or not 

        // public static int countRemoDigit(int n)
        // {
        //     int m=1;
        //     while(n>0)
        //     {
        //         m=m*10;
        //         n=n/10;
        //     }
        //     return m;
        // }

        // public static boolean isAutomorphic(int n)
        // {
        //     if(n==(n*n)%countRemoDigit(n))
        //     {
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }
        // }

        // public static void main(String[] args) {
        //     System.out.println(isAutomorphic(376));
        // }


        







        // Q5. WAJP to find whether the number is xylem or phloem.
            // XYLEM:-sum of digit of a number is equal to remaining digit of a number 


            public static boolean isXylem(int n)
            {   int temp=n;
                int extremevalue=0;
                int midvalue=0;
                while(n>0)
                {
                    if(n==temp||n<10)
                    {
                        int ls=n%10;
                        extremevalue=extremevalue+ls;
                        n=n/10;
                    }
                    else
                    {
                        int ld=n%10;
                        midvalue=midvalue+ld;
                        n=n/10;
                    }
                     
                }
                if(midvalue==extremevalue)
                {
                    return true;
                }
                else
                {
                    return false;
                }
               
            }


            public static void main(String[] args) {

                System.out.println(isXylem(12348));
            }

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


// public static void xylemOrPhloem(int n){
//         int ld = n%10;
//         n /= 10;
//         int sum = 0;
//         while(n>9){
//             int last = n%10;
//             sum += last;
//             n /= 10;
//         }
//         if(sum == (ld+n)){
//             System.out.println("Number is Xylem");
//         }else{
//             System.out.println("Number is Phloem");
//         }
//     }

//     public static void main(String[] args) {
//         int n = 121;
//         xylemOrPhloem(n);
//     }




    //Q6. WAJP to find the middle number from the passed number
    
    // public static int countDigits(int n){
    //         int count =0;
    //         while(n>0){
    //             count++;
    //             n /= 10;
    //         }
    //         return count;
    //     }
    
    //     public static int middleNum(int n){
    //         if(countDigits(n)%2==1){
    //             int divisBy = 1;
    //             for(int i=1; i<=countDigits(n)/2; i++){
    //                 divisBy *= 10; 
    //             }
    //             n = n/divisBy;
    //             return n%10;
    //         }else{
    //             int diviBy = 1;
    //             for(int i=1; i<countDigits(n)/2; i++){
    //                 diviBy *= 10; 
    //             }
    //             n = n/diviByk;
    //             return n%100;
    //         }
    //     }
    
    //     public static void main(String[] args) {
    //         int n = 123456;
    //         int res = middleNum(n);
    //         System.out.println(res);
    //     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Q7. WAJP to find first 25 prime numbers.
    // public static void printPrime(int n){
    //     int count = 0;
    //     for(int i = 1; i<Integer.MAX_VALUE; i++){
    //         boolean flag = true;
    //         for(int j = 2; j<=i/2; j++){
    //             if(i%j==0){
    //                 flag = false;
    //             }
    //         }

    //         if(flag){
    //             System.out.print(i + ", ");
    //             count++;
    //         }
            
    //         if(count==n){
    //             return;
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     int n = 25;
    //     printPrime(n);
    // }



















}

