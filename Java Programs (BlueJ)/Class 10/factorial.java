import java.util.*;
class factorial

{
    int n,f;
    factorial()
    {
        int n=0;
        f=0;
    }
    int fact(int num)
    {
        n=num;
        if(n==0)
        {
          return(1);
        }
        else
        {
            return(n*fact(n-1));
        }
    }
        void get(int x)
        {
            n=x;
            f=fact(n);
            System.out.println("The factorial of "+x+" is "+f);
        }
        public static void main(String args[])
        {
            int m;
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter a number");
            m=sc.nextInt();
            factorial ob=new factorial();
            ob.get(m);
        }
    }

    