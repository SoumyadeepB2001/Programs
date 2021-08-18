// To store 10 decimal numbers in a single dimensional array and convert them into their binary equivalent
import java.util.*;
class sda
{
    public static void main(String args[])
    {
       int i,a,r;
       String s="";
       int num[]=new int[10];
       Scanner sc=new Scanner(System.in);
       for(i=0;i<10;i++)
       {
           System.out.println("Enter 10 decimal numbers");
           num[i]=sc.nextInt();
       }
       System.out.println("The binary equivalent of the 10 numbers");
       for(i=0;i<10;i++)
       {
        a=num[i];
        s="";
        while(a>0)
        {
          r=a%2;
          s=s+r;
          a=a/2;
        }
        System.out.println(num[i]+" = "+s);
       }
    }
}
        