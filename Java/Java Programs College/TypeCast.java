import java.util.*;
public class TypeCast
{
public static void main(String args[])
{
double a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
int sum;
sum=(int)(a+b+c);
System.out.println("Sum = "+sum);
}
}