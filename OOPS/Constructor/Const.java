
class const{

int empid;
String name;
Double sal;
int deptno;


const()
{
    Sout("This is empty constructor");
}

const(int empid)
{
    Sout("This is 1 parameter constructor");
}

const(int empid,String name)
{
    Sout("This is 2 parameter constructor");
}

const(int empid,String name,double sal)
{
    Sout("This is 3 parameter constructor");
}



}