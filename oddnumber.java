class oddnumber{
public static void main(String[]args)
{
int sum=9;
int count=0;
for(int n=1;n<=10;n++){
if(n%2!=0)
{
count++;
sum=sum+n;
System.out.println(count + "is:"+n);
}
n++;
}
System.out.println(sum);
}
}