//Code written in derived class
class Area extends Perimeter
{
    double h;
    double area;
    Area(double m, double n, double ht)
    {
        super(m,n);
        h=ht;
    }
    void doarea()
    {
        area=b*h;
    }
    void show()
    {
        super.show();
        System.out.println("Height of the Parallelogram: "+h);
        System.out.println("Area of the Parallelogram: "+area);
    }
}
//End of derived class