
import java.util.*;
class credit_card
{
    public static void main(String args[])
    {
        int m;
        double cb;
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and money spent");
        n=sc.nextLine();
        m=sc.nextInt();
        System.out.println("NAME- "+n);
        System.out.println("MONEY SPENT= "+m);
        if(m>=1 && m<=1000)
        {
            cb=100;
            System.out.println("CASH BACK= "+cb);
        }
        else if(m>=1001 && m<=3000)
        {
            cb= 200+ (2/100)*(m-1000);
            System.out.println("CASH BACK= "+cb);
        }
        else if(m>=3001 && m<=7000)
        {
            cb= 400+ (4/100)*(m-3000);
            System.out.println("CASH BACK= "+cb);
        }
        else if(m>=7001 && m<=15000)
        {
            cb= 800+ (8/100)*(m-8000);
            System.out.println("CASH BACK= "+cb);
        }
        else
        {
            System.out.println("LIMIT EXCEEDED");
                    }
}
}

