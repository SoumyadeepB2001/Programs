import java.util.*;
class arraypattern
{
    public static void main(String args[])
{
int i,odd=0,even,n,k,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an odd number");
n=sc.nextInt();
even=n-1;
if(n%2==1)
{
 int a[]=new int [n];
 int b[]=new int [n];
 for(i=0;i<n;i++)
 {
   System.out.println("Enter a number");
   a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
 {
     for(j=i+1;j<n;j++)
     {
         if(a[i]<a[j])
         {
             k=a[i];
             a[i]=a[j];
             a[j]=k;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        if(i%2==0)
        {
            b[odd]=a[i];
            odd++;
        }
        if(i%2==1)
        {
            b[even]=a[i];
            even--;
        }
    }
     for(i=0;i<n;i++)
 {
     System.out.print(b[i]);
    }
}
else
{
    System.out.println("Invalid number");
}
}
}

