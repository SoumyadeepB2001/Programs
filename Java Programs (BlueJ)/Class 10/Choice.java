import java.util.*;
class Choice
{
public static void main (String args [])
{
    int n,fn,f=1;
    double a,b,c=0;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1 to find Natural Logarithm of a number");
    System.out.println("Enter 2 to find Absolute Value of a number");
    System.out.println("Enter 3 to find Square Root of a number");
    System.out.println("Enter 4 to find Cube Root of a number");
    System.out.println("Enter 5 to find Natural Sine of a number");
    System.out.println("Enter 6 to find Natural Cosine of a number");
    System.out.println("Enter 7 to find Natural Tangent of a number");
    System.out.println("Enter 8 to find the Factorial of a number");
    System.out.println("Enter 9 to find all the factors of a number");
    System.out.println("Enter 10 to find weather the number is Prime or Composite number");
    System.out.println("Enter your choice");
    n=sc.nextInt();
    switch(n)
    {
        case 1:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        System.out.println("Natural Log = "+Math.log(a));
        break;
        case 2:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        System.out.println("Absolute Value = "+Math.abs(a));
        break;
        case 3:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        System.out.println("Square Root = "+Math.sqrt(a));
        break;
        case 4:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        break;
        case 5:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        System.out.println("Natural Sine = "+Math.sin(a));
        break;
        case 6:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        System.out.println("Natural Cosine = "+Math.cos(a));
        break;
        case 7:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        System.out.println("Natural Tangent = "+Math.tan(a));
        break;
        
         case 8:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        for(fn=1;fn<=a;fn++)
        {
            f=f*fn;
        }
        System.out.println("Factorial of "+a+" = "+f);
        break;
        
         case 9:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        System.out.print("The Factors of "+a+" are ");
        for(fn=1;fn<=a;fn++)
        {
            if(a%fn==0)
                System.out.print(fn+" ");
        }
        break;
         case 10:
        System.out.println("Enter a number");
        a=sc.nextDouble();
        for (b=1; b<=a; b++)
        {
             if (a%b==0)
            c++;
           
        }
        if (c==2)
        System.out.println (a+" is a prime number");
        else
        System.out.println (a+" is a composite number");
        break;
        default:
        System.out.println("Invalid Choice");
        
        
    }
}
}

       
        


       
        