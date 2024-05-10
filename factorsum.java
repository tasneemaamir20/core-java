class factorsum{
public static void main(String[]args)
{
int f=6;
int sum=0;
for(int n=1;n<=f;n++){
if(f%n==0)
{
sum += n;
}

}
System.out.println(sum);
}

}
