class method1{
public static void demo()
{
System.out.println("demo page");
}
public static int A(int a)
{
System.out.println("this is A ");
return a*a;
}
public static int B(int k,int m)
{
System.out.println("this is B");
demo();
return A(k)+A(m)+k*m;
}
public static int c(int a ,int b,int c)
{
System.out.println("this is C");
int z=A(a)* B(a,b);
return  (a+b+c)+A(c)+b(b,c)-z;
}
public static void main(String[]args)
{
int k=c(1,2,3);
System.out.println("demo page");
}
}}