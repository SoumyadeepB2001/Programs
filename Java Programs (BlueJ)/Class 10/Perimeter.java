//Code written in base class
class Perimeter
{
    double a,b;
    Perimeter(double x,double y) //Default constructor to initialise the values
    {
        a=x;
        b=y;
    }
    double calculate()
    {
        double z;
        z=2*(a+b);
        return(z);
    }
    void show()
    {
        System.out.println("Length of the Parallelogram: "+a);
        System.out.println("Breadth of the Parallelogram: "+b);
        System.out.println("Perimeter of the Parallelogram: "+calculate());
    }
}
//End of base class