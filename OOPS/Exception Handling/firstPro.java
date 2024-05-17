import java.util.Scanner;

public class firstPro
{
    public static void main(String[] args) {

        // //  case 1=when there is no exception
        //     int arr[]={1,2,3,4,5,6};
        //     for(int i=0;i<=arr.length;i++)
        //     {
        //         System.out.print(arr[i]);
        //     }
        //     System.out.println("program ends");

        




        // // case 2=when exception occurs and handled
        // try{
        //     int arr1[]={1,2,3,4,5,6};
        //     for(int i=0;i<arr.length+1;i++)
        //     {
        //         System.out.print(arr1[i]);
        //     }
        //     System.out.println("program ends");

        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Your are trying to fetch the data which is not in an given array");
        // }
        //             System.out.println("program ends");





         //When exception occurs but not handled
         
            // String s=null;
            // System.out.println(s.charAt(2));
         
        //   int arr2[]={1,2,3,4,5,6};
        //     for(int i=0;i<arr2.length+1;i++)
        //     {
        //         System.out.print(arr2[i]);
        //     }
        //     System.out.println("program ends");





        // before try block
            // String s=null;
            // System.out.println(s.charAt(2));
            // try{
                
            // // String s1=null;
            // // System.out.println(s1.charAt(2));
            // }
            // catch(NullPointerException e)
            // {
            //     System.out.println("Null pointer exception");
            // }


                // after catch block

            try{
                
            String s1=null;
            System.out.println(s1.charAt(2));
            }
            catch(NullPointerException e)
            {
                System.out.println("Null pointer exception");
            }

            
            String s=null;
            System.out.println(s.charAt(2));
    }
}