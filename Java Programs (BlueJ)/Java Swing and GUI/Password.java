import java.util.*;
class Password
{
    public static void main(String args[])
    {
        char ch[]=new char[94];
        for(int i=33;i<=126;i++)
        ch[i-33]=(char)i;
        String pass="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the required length of your password");
        int n=sc.nextInt();
        
       for(int i=0;i<n;i++)
       {
        int rnd = (int)(Math.random()*ch.length);
        pass=pass+ch[rnd];
       }
       System.out.println("Your new password = "+pass);
    }
}