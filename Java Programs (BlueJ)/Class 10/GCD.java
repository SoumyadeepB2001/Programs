import java.util.*;
class GCD
{
int calc(int p,int q) //Recursive function for calculating GCD
{
    if(q==0)
return p;
else 
return calc(q,p%q);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers"); //Accepting two numbers from the user
int p=sc.nextInt();
int q=sc.nextInt();
GCD ob=new GCD();
int g=ob.calc(p,q);
System.out.println("GCD ="+g);
}
}
