public class Employee {
    static String comName = "WIPRO";
    int empid;
    String name;
    double sal;
    double comm;
    int deptno;
    // Display method --> To display all the details.
    public void display(){
        System.out.println("Company     : " + comName);
        if(empid==0){
            System.out.println("ID          : " + "Employee Id should be an even number of 4 digits.");
        }else{
            System.out.println("ID          : " + empid);
        }
        if(name==null){
            System.out.println("Name        : " + "");
        }else{
            System.out.println("Name        : " + name);
        }
        if(sal==0.0){
            System.out.println("sal         : " + "Salary should be greater than 0 and less than 10000.");
            System.out.println("After Tax   : " + sal);
        }
        else{
            if(sal<2000){
                System.out.println("salary      : " + sal);
                System.out.println("After Tax   : " + sal);
            }else if(sal<5001){
                System.out.println("salary      : " + sal);
                System.out.println("After Tax   : " + (sal-sal*0.1));
            }else if(sal<8001){
                System.out.println("salary      : " + sal);
                System.out.println("After Tax   : " + (sal-sal*0.15));
            }else{
                System.out.println("salary      : " + sal);
                System.out.println("After Tax   : " + (sal-sal*0.2));
            }
        }
        if(comm==0.0){
            System.out.println("Commission  : " + "Commission should be greater than 0 and less than salary.");
        }else{
            System.out.println("Commission  : " + comm);
        }
        if(deptno == 0){
            System.out.println("Department  : " + "Department number should be a 2 digits number and in multiple of 10.");
        }else{
            System.out.println("Department  : " + deptno);
        }
    }
    // Method for counting no. of digits in a passed number.
    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
    // Constructor 1
    Employee(){
        display();
    }
    // Constructor 2
    Employee(int empid){
        if( countDigits(empid) == 4 && (empid%2) == 0 ){
            this.empid = empid;
        }
        display();
    }
    // Constructor 3
    Employee(int empid, String name){
        if( countDigits(empid) == 4 && (empid%2) == 0 ){
            this.empid = empid;
        }
        this.name = name;
        display();
    }
    // Constructor 4
    Employee(int empid, String name, double sal){
        if( countDigits(empid) == 4 && (empid%2) == 0 ){
            this.empid = empid;
        }
        this.name = name;
        if(sal > 0 && sal<10000){
            this.sal = sal;
        }
        display();
    }
    // Constructor 5
    Employee(int empid, String name, double sal, double comm){
        if( countDigits(empid) == 4 && (empid%2) == 0 ){
            this.empid = empid;
        }
        this.name = name;
        if(sal > 0 && sal<10000){
            this.sal = sal;
        }
        if( comm > 0 && comm <= sal ){
            this.comm = comm;
        }
        display();
    }
    // Constructor 6
    Employee(int empid, String name, double sal, double comm, int deptno){
        if( countDigits(empid) == 4 && (empid%2) == 0 ){
            this.empid = empid;
        }
        this.name = name;
        if(sal > 0 && sal<10000){
            this.sal = sal;
        }
        if( comm > 0 && comm <= sal ){
            this.comm = comm;
        }
        if(deptno%10==0 && countDigits(deptno)==2){
            this.deptno = deptno;
        }
        display();
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e2 = new Employee(2012);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e3 = new Employee(2023);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e4 = new Employee(12345);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e5 = new Employee(1234, "GULDU");
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e6 = new Employee(5678, "GULDI", 1500);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e7 = new Employee(2468, "DINGA", 2500);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e8 = new Employee(4862, "DINGI", 6000);
        System.out.println();
        System.out.println("===================================================================================");
        Employee e9 = new Employee(3698, "SUNDRA", 9000);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e10 = new Employee(2365, "SUNDRI", -8542);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e11 = new Employee(2344, "ALIA", 2000, 500);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e12 = new Employee(2346, "RANBIR", 1600, 2000);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e13 = new Employee(2300, "SURAJ", 1400, -50);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e14 = new Employee(2000, "RAWAT", 1000, 300, 50);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e15 = new Employee(1000, "BABITA", 1300, 500, 35);
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        Employee e16 = new Employee(2365, "RESHMA", 12000, -600, 76);
    }
}

