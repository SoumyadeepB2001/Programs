import java.util.*;
class ETypeCast
{
public static void main(String args[])
{
double a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three integers");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
int sum;
sum=(int)a+(int)b+(int)c;
System.out.println("Sum = "+sum);
}
}