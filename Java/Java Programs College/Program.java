import java.util.*;
class Great
{
int a,b,c;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
}
void output()
{
System.out.println("Greatest number = "+(a>=b?a>=c?a:c:b>=c?b:c));
}
}
class Run
{
public static void main(String args[])
{
Great ob=new Great();
ob.input();
ob.output();
}
}