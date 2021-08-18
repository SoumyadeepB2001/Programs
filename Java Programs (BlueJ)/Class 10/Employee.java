//Code written in base class
import java.util.*;
class Employee
{
    int empc;
    double bpay;
    Employee()
    {
        empc=0;
        bpay=0;
    }
    void Employee(int c,double b)
    {
        empc=c;
        bpay=b;
    }
    void Display()
    {
        System.out.println("Employee Code = "+empc);
        System.out.println("Basic Pay = Rs."+bpay);
    }
}//End of base class 