import java.util.*;
class Smith_number
{
    int sumDig(int n) //Function for finding sum of digits
     {
         int s=0;
         while(n>0)
          {
              s=s+n%10;
              n=n/10;
          }
          return s;
     }     
     //Function for finding the prime factors and their sum
     int sumPrimeFact(int n)
      {
          int i=2,sum=0;
          while(n>1)
           {
               if(n%i==0)
                {
                    sum=sum+sumDig(i);    
                    n=n/i;
                }
           else
            i++;
          }
       return sum;
    }          
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Smith_number ob=new Smith_number();
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int a=ob.sumDig(n);//finding sum of digit
        int b=ob.sumPrimeFact(n);//finding sum of prime factors
        System.out.println("Sum of Digit = "+a);
        System.out.println("Sum of Prime Factors = "+b);
        if(a==b)
           System.out.println("It is a Smith Number");
            else 
              System.out.println("It is not a Smith Number");
     }
    }