import java.util.*;
class tri
{
    public static void main (String args [])
    {
        Scanner sc=new Scanner (System.in);
        double h, b, s, a=0, p=0, sp=0, c=0;
        System.out.println ("Enter length of one Side");
        h=sc.nextDouble ();
        System.out.println ("Enter length of Base");
        b=sc.nextDouble ();
        System.out.println ("Enter length of other Side");
        s=sc.nextDouble ();
        p = h+b+s;
        sp = p/2;
        c = sp*(sp-h)*(sp-s)*(sp-b);
        a = Math.sqrt (c);
        System.out.println ("Perimeter = "+p);
        System.out.println ("Area = "+a);
    }
}
        
        
        
        