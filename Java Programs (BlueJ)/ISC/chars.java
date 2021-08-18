import java.util.*;
class chars
{
    public static void main(String args[])
    {
int i,k,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter lower and upper limits");
i=sc.nextInt();
j=sc.nextInt();
for(k=i;k<=j;k++)
{
    System.out.println(k+"="+(char)k);
}
}
}