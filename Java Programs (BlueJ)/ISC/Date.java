import java.util.*;
class Date
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date in dd/mm/yyyy format:");
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31}; //Array for storing the number of days in each month
                       
        int s=0;
        if(y%4==0) //Leap year
        a[1]=29;
        if(m<=12) //Checks validity of month
        {
            if(d<=a[m-1]) //Checks validity of day
            {
                System.out.println("Valid Date");
                for(int i=0;i<m-1;i++) //Calculates which date of the year
                 s=s+a[i];
                s=s+d;
                if(s%10==1)
                System.out.println(s+"st day of the year");
                else if(s%10==2)
                System.out.println(s+"nd day of the year");
                else if(s%10==3)
                System.out.println(s+"rd day of the year");
                else
                System.out.println(s+"th day of the year");
            }
            else
            System.out.println("Invalid date");
        }
        else
        System.out.println("Invalid date");
    }
}
