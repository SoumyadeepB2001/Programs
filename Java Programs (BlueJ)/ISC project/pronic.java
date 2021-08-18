import java.util.*;
class pronic
{
    public static void main(String args[])
    {
        int n,k=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
              k=1;
              break;
            }
        } 
        if(k==1)
        {
            System.out.println("IT IS A PRONIC NUMBER");  
        }
        else
        {
            System.out.println("IT IS NOT A PRONIC NUMBER");
        } 
    }
}
