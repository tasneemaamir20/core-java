import java.util.Scanner;

public class WhileProgram{


/*
wajp to find wherther the number is xylem,floem
 if the sum of extreme digit is equal to the remainig digit is known as xylem else floem.
tc= 24125     2+5=7||4+1+2=7  is a xylem number
tc = 286  

*/





public static int firLastSum(int n){
int sum1=0; 
	int l=n%10;
	while(n>=10)
	{
		n=n/10;
	
	}
	sum1=l+n;
				
 return sum1;
}
public static int inBetweenSum(int n)
{
	
}
	

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int res=prodOfSum(n);
System.out.print(res);


}











/*
wajp to find whether the number is a spy number or not.
if some of digit of number and product of digit of number is same then its knows as spy  number 
tc 123  ===> 1+2+3=6 ||1*2*3=6
tc 451  ===>4+5+1=10|| 4*5*1=20  not a spy number 


public static int addNum(int n)
{

	int sum=0;
	while(n>0)
	{
		int l=n%10;
		sum=sum+l;
		n=n/10;
	}

	return sum;

}
public static int ProdNum(int n)
{

	int pro=1;
	while(n>0)
	{
		int l=n%10;
		pro=pro*l;
		n=n/10;
	}

	
	return pro;


}


public static void main(String[]args)
{	

	int a=addNum(123);
	int b=ProdNum(123);
	if(a==b)
	{
		System.out.print("this is spy number");
	}
	else
	{
		System.out.println(" this is not a spy number");
	}

}

*/

/*










/*

 to find whether the number ios neon number is not 
 if a number by suaring its number the sum of digit of number is equal to the number itself.
tc = 9 ===> 9*9=81|| 8+1=9     is a neon number

public static void isNeon(int n)
{	

	int sum=0;
	int square=n*n;
	while(square>0)
	{
		int l=square%10;
		 sum=sum+l;
		square=square/10;
	}
	if(sum==n)
	{
		System.out.print("number is neon number");
	}
	else
	{
		System.out.print("number is not neon number");
	}
	
}
public static void main(String[]args)
{
	isNeon(6);

}

*/
























   
/*
public static boolean isPeter(int n)
{
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int l=n%10;
		sum=sum+fact(l);
		n=n/10;
	}
	if(sum==n)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}

public static int fact(int n)
{	
	

	int fact=1;

	for(int i=2;i<=n;i++)
	{
		fact=fact*i;
	}
return fact;
}

public static void main(String[]args)
{
	System.out.println(isPeter(145));

}

*/














/*
public static int FactNo(int n)
{
	int fact=1;
	for(int i=2;i<n;i++)
	{
		fact=fact*i;
	}
	return fact;
}
public static void main(String[]args)
{
int k=FactNo(5);
System.out.println("the factorial is="+k);
}

*/










/*
public static void perfectSquare(int n)
{
   
	for(int i=0;i<=n;i++)
	{
		if(i*i==n+1)
		{
			System.out.print("The number is sunny number");
			break;
		}
		if(i*i>n+1)
		{	
			System.out.print("The number is not  sunny number ");
			break;
		}
	}
}

public static void main(String[]args)
{
perfectSquare(8);
}



*/













/*

public static void perfectSquare(int n)
{
   
	for(int i=0;i<=n;i++)
	{
		if(i*i==n)
		{
			System.out.print("The number is of perfect sqaure");
			break;
		}
		if(i*i>n)
		{	
			System.out.print("The number is of not perfect sqaure ");
			break;
		}
	}
}

public static void main(String[]args)
{
perfectSquare(8);
}


*/









/*

public static int prodOfSum(int n){
int sum1=0; 



	int l=n%10;
	sum1=sum1+l;
	n=n/10;
	
	int m=n%10;
	sum1=sum1+m;
	n=n/10;
	while(n>99)
	{
		n=n/10;
	}
	int p=n%10;
	sum1=sum1+p;
	n=n/10;
	
	int o=n%10;
	sum1=sum1+o;
return sum1;
}


public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
	if(n<999)
	{	
		System.out.println("Warning !! enter more than 4 digit");	
	}
	else{
int res=prodOfSum(n);
System.out.print(res);
}

*/


/*
public static int ExcluFirstLast(int n)
{
	int sum1=0; 
	n=n/10;
	
	while(n>9)
	{
		int k=n%10;
		sum1=sum1+k;
		n=n/10;
	}
	
				
 return sum1;
}


public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int res=ExcluFirstLast(n);
System.out.print(res);

*/





/*
public static int prodOfSum(int n){
int sum1=0; 
	int l=n%10;
	while(n>=10)
	{
		n=n/10;
	
	}
	sum1=l+n;
				
 return sum1;
}


public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int res=prodOfSum(n);
System.out.print(res);

*/












/*

public static int prodOfSum(int n){
int sum1=0; int sum2=0;

	while(n>0)
	{
		
		int l=n%10;
		if(l%2==0)
		{
			sum1=sum1+l;
		}
		else
		{
			sum2=sum2+l;
	}
	n=n/10;
	}	
 return sum1*sum2;
}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int res=prodOfSum(n);
System.out.print(res);
*/








/*
public static int sumOfEvenDig(int n){

	int sum=0;
	while(n>0)
	{
		int l=n%10;
		if(l%2==0)
		{
			sum=sum+l;
		}
		n=n/10;
		
	}
return sum;
}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int res=sumOfEvenDig(n);
System.out.print(res);
*/














/*
public static int sumOfDig(int n){
	int sum=1;
	while(n>0)
	{
	int l=n%10;
	sum=sum*l;
	n=n/10;
	}
	return sum;
}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int res=sumOfDig(n);
System.out.print(res);
*/


















/*
public static int sumOfDig(int n){
	int sum=0;
	while(n>0)
	{
	int l=n%10;
	sum=sum+l;
	n=n/10;
	}
	return sum;
}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int n=sc.nextInt();
int res=sumOfDig(n);
System.out.print(res);
*/























	/*
Q1. WAJP to find the number of even digit
public static int numberOfEvanDig(int a)
	{
		int ecount=0;
		while (a!=0)
		{
			int l=a%10;
			if(a%2==0)
			{
				ecount++;
			}
			a=a/10;
		}
return ecount;
	}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int a=sc.nextInt();
int res=numberOfEvanDig(a);
System.out.print(res);

*/



















/*
Q2. WAJP to find the number iss of odd number of digit or even 
public static int numberOfEvanDig(int a)
	{
		int ecount=0;
		while (a!=0)
		{
			int l=a%10;
			if(a%2==0)
			{
				ecount++;
			}
			a=a/10;
		}
return ecount;
	}
public static int numberOfOddDig(int a)
	{
		int ocount=0;
		while (a!=0)
		{
			int l=a%10;
			if(a%2!=0)
			{
				ocount++;
			} 
			a=a/10;
		}
return ocount;
	}


public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int res=numberOfEvanDig(a);
System.out.println("number of even : "+ res);
int res1 =numberOfOddDig(a);
System.out.println("number of odd : "+ res1);
*/























/*	
Q1. WAJP to find the number of even digit
public static void numberOfEvanDig(int a)
	{
		int count=0;
		while (a!=0)
		{
			int l=a%10;
			
			count++;
			
			a=a/10;
		}
	if(count%2==1)
	{
	System.out.println("ODD");
	}
	else
	{
	System.out.println("EVEN");
	}
	}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
int a=sc.nextInt();

numberOfEvanDig(a);


*/


















// System.out.println("Enter the starting number");
// System.out.println("Enter the end number");

// Scanner sc=new Scanner(System.in);
// int m=sc.nextInt();
// int n=sc.nextInt();
// while(m<=n)
// {
// System.out.println(m);
// m++;
// }















// System.out.println("Enter the  number");


// Scanner sc=new Scanner(System.in);
// int m=sc.nextInt();
 
// int n=1;
// while(n<=10)
// {
// 	System.out.println(m*n);
// 	n++;
// }













// System.out.println("Enter the starting number");
// System.out.println("Enter the end number");

// Scanner sc=new Scanner(System.in);
// int m=sc.nextInt();
// int n=sc.nextInt();
// while(m<=n)
// {
// if(m%2!=0)
// System.out.println(m);
// m++;
// }





}

