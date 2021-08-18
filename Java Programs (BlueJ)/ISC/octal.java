import java.util.*;
class octal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int n=sc.nextInt();
        int r=0,r1=0,d=0,oct=0;        
        while(n!=0)
        {
           r=n%8; //Finding the remainder by dividing by 8
           r1=r1*10+r; //Adding the remainder to the result
           n=n/8;
        }
        while(r1!=0)  //Reverses the result to get the octal equivalent
        {
            d=r1%10;
            oct=oct*10+d;
            r1=r1/10;
        }
        System.out.println("Octal Equivalent:"+oct);
    }
}