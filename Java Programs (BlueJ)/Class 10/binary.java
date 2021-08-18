import java.util.*;
class binary
{
    String s="";
    int r;
    String convert(int n)
    {
        if(n==0)
        {
            return(s);
        }
        else
        {
            r=n%2;
            s=r+s;
            return(convert(n/2));
        }
    }
    public static void main(String args[])
    {
        int n1;
        String k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        n1=sc.nextInt();
        binary ob=new binary();
        k=ob.convert(n1);
        System.out.println("Binary form of "+n1+" = "+ k);
    }
}