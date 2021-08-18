//Code written in derived class
import java.util.*;
class Overtime extends Employee
{
    int nd;
    double rate;
    Overtime(int n, double r)
    {
        nd=n;
        rate=r;
    }
    double Calculate()
    {
        double ts;
        ts=bpay+(nd*rate);
        return(ts);
    }
    void Show()
    {
        Display();
        double x=Calculate();
        System.out.println("Number of days worked: "+nd);
        System.out.println("Amount paid for extra hours: "+(nd*rate));
        System.out.println("Salary: Rs." + x);
    }
}
//End of derived class