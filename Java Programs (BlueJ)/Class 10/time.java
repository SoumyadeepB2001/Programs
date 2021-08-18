import java.util.*;
class time
{
    public static void main(String args[])
    {
        int h1,h2,h3,m1,m2,m3,m4,c=0;
        Scanner sc=new Scanner (System.in);
 
        System.out.println("ENTER FIRST TIME INTERVAL");
        System.out.println("ENTER HOUR");
        h1=sc.nextInt();
        System.out.println("ENTER MINUTES");
        m1=sc.nextInt();
        System.out.println("ENTER SECOND TIME INTERVAL");
        System.out.println("ENTER HOUR");
        h2=sc.nextInt();
        System.out.println("ENTER MINUTES");
        m2=sc.nextInt();
        m3=m1+m2;
        h3=h1+h2;
        if(m3>60)
        {
            
            while(m3>=60)
            {
            m3=m3-60;
            c++;
            }
            h3=h3+c;
            System.out.println("TOTAL TIME= "+h3+ " hours "+m3+" mins ");
         }
         else
            {
                System.out.println("TOTAL TIME= "+h3+ " hours "+m3+" mins ");
            }
        }
    }

    