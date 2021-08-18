import java.util.*;
class number
{
    public static void main(String args[])
    {
       int n,b,k=3;
       String s="";
       String a[]= {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirten", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred", "Thousand"};       
       int n1[]=new int [4];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a four digit number");
       n=sc.nextInt();
       if(n>=1000 && n<=9999)
       {
       b=n;
       while(b>0)
       {
           n1[k]=b%10;
           k--;
           b=b/10;
       }
       s=s+a[n1[0]]+" "+ a[29]+" ";
       if(n1[1]!=0)
       {
           s=s+a[n1[1]]+" "+a[28]+" ";
        }
        if(n1[2]>1)
        {
            s=s+a[n1[2]+18]+" ";
        }
        if(n1[2]==1)
        {
            s=s+a[n1[3]+10]+" ";
        }
        if(n1[2]!=1)
        {
            s=s+a[n1[3]]+" ";
        }
        System.out.println(s);
      }
        else
        {
         System.out.println("Invalid Input");
        }
    }
}
