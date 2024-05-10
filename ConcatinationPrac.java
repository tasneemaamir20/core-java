import java.util.Scanner;

public class ConcatinationPrac {
    public static void main(String[] args) {

        //!operator
        // int a=10;
        // int age=15;
        // System.out.println(a+'a'+"a"+'a'+a);
        // System.err.println(10+10+"Hello"+10+29);
        // System.out.println(a+'a');
        // System.err.println('a'-a*10+"a"+a*a+'a'+a);
        // System.err.println(age/3==5?"Eligible":"Not eligibel");

        // !looping 
        // ?for loop

        //?  1.
            // for(int i=0;i<=5;i++)
            // {
            //     System.err.println("hello");
            // }

        //? 2. 
            // for(int i=1;i<=10;i++)
            // {
            //     System.err.println(i);
            // }

        //? 1
            // for(int i=20;i>=10;i--)
            // {
            //     System.out.println(i);
            // }


        //? 2
            // for(int i=20;i<=40;i++)
            // {
            //     if(i%2==1)
            //     {
            //         System.out.println(i);
            //     }
            // }

        //? 3
            // for(int i=2;i<=20;i++)
            // {
            //     if(i%2==0)
            //     {
            //         System.out.println(i);
            //     }
            // }

        //? 4
            // for(char a='A';a<='Z';a++)
            // {
            //     System.out.println(a);
            // }

        // ? 5
            // for(int i=1;i<=10;i++)
            // {
            //     System.out.println(5*i);
            // }

        // ?6
            // for(char a='z';a>='a';a--)
            // {
            //     System.out.println(a);
            // }

        // ?7
                // Scanner sc=new Scanner(System.in);
                // char a=sc.next().charAt(0);
                // if(a=='a'||a=='e'||a=='o'||a=='u'||a=='i')
                // {
                //     System.out.println("vowel");
                // }else
                // {
                //     System.out.println("not a vowel");
                // }

        // ? 8
                // Scanner sc=new Scanner(System.in);
                // char a=sc.next().charAt(0);
                // if(a>='a'&& a<='z')
                // {
                //     System.out.println("alphabet");
                // }
                // else if(a>='0' && a<='9')
                // {
                //     System.out.println("number");
                // }
                // else{
                //     System.out.println("symbol");
                // }

        // ? 9
                // for(int i=0;i<=100;i++)
                // {
                //     if(i%7==0)
                //     {
                //         System.out.println(i);
                //     }
                // }

        // ? 10
                // int sum=0;
                // for(int i=1;i<=10;i++)
                // {
                //     sum=sum+i;
                // }
                // System.out.println(sum);

        // ? 11
                // Scanner sc=new Scanner(System.in);
                // char s=sc.next().charAt(0);
                // if(s>='a'&& s<='z')
                // {
                //     if(s=='a'||s=='e'||s=='i' ||s=='o' ||s=='u')
                //     {
                //         System.out.println("small letter vowel");
                //     }
                //     else {
                //         System.out.println(s+"="+" small conconent");
                //     }
                // }
                // else if(s>='A' && s<='Z')
                // {
                //     if(s=='A'||s=='E'||s=='I' ||s=='O' ||s=='U')
                //     {
                //         System.out.println("capital letter vowel");
                //     }
                //     else
                //     {
                //         System.out.println(s+"="+" capital conconent");

                //     }
                // }
                // else{
                //     System.out.println("not a alphabet");
                // }

        // ? 12
                // int sum=0;
                // for(int i=1;i<=10;i++)
                // {
                //     if(i%2==0)
                //     {
                //         sum=sum+i;
                //     }
                // }
                // System.out.println(sum);

        // ? 13
                // int pro=1;
                // for(int i=1;i<=10;i++)
                // {
                //     if(i%2==1)
                //     {
                //         pro=pro*i;
                //     }
                // }
                // System.out.println(pro);

        // ? 14
                // int pro=1;
                // for(int i=1;i<=10;i++)
                // {
                //     pro=pro*i;
                // }
                // System.out.println(pro);

        // ? 15
                // int fact=1;
                // Scanner sc=new Scanner(System.in);
                // int a=sc.nextInt();
                // for(int i=a;i>=1;i--)
                // {
                //     fact=fact*i;
                // }
                // System.out.println(fact);

        // ? 16
                int sum=0;
                Scanner sc=new Scanner(System.in);
                int s=sc.nextInt();
                for(int i=s;i>=1;i--)
                {
                    if(s%i==0)
                    {
                        sum=sum+i;
                    }
                }
                System.out.println(sum);

    }
}
