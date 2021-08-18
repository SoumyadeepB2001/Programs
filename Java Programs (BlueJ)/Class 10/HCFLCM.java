import java.util.*;
class HCFLCM
{
    int p,i,hcf,a,b;
    int hlcm(int n,int m)
    {
        p=n*m;
        for(i=1;i<=p;i++)
        {
            if(n%i==0 && m%i==0)
            {
                hcf=i;
            }
        }
            return(hcf);
        
    }
        public static void main(String args [])
        {
            int a,b,k,lcm;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 2 numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            HCFLCM ob=new HCFLCM();
            k=ob.hlcm(a,b);
            lcm=(a*b)/k;
            System.out.println(k);
            System.out.println(lcm);
        }
    }


            