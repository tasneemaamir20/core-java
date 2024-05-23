public class student {
    static String colg_name="fakeerchand and lakeerchand university";
    String stu_name;
    int stu_age;
    char stu_gender;
    int stu_phonenum;
    double perc;
    int count;



    public void display()

    {
        System.out.println( stu_name);
         if(stu_age>=4 && stu_age<=50)
        {
           System.out.println(stu_age);
        }else{
            System.out.println("error");
        }
        


        if(stu_gender=='M'||stu_gender=='F')
        {
           System.out.println(stu_gender);
        }else{
            System.out.println("error");
        }
        
        if(phonenum(stu_phonenum)==6){
        System.out.println(stu_phonenum);
        }
        else{
            System.out.println("error");
        }


        if(perc>=30 && perc<=100)
        {
           System.out.println( perc);
        }else{
            System.out.println("error");
        }

       
    }
    student(String a, int b, char c, int d,double e )
    {
        stu_name=a;
        stu_age=b;
        if(c=='M'||c=='F')
        {
        stu_gender=c;
        }
        stu_phonenum=d;
        perc=e;
        display();
    }


	public int phonenum(int d)
	{
		int count=0;
		while(d>0)
		{
			count++;
			d=d/10;
		}
	return count;
	}




    public static void main(String[] args) {
        student s1=new student("ALIA BHATT",22,'F',123456,75.2);
        System.out.println("________________________________");
        student s2=new student("VIJAY KUMAR",145,'M',12345678,85.3);
        System.out.println("________________________________");
        student s3=new student("YASH",35,'K',123456,130.22);
        System.out.println("________________________________");
        student s4=new student("RANI",88,'Z',12345,25.5);
    }

}
