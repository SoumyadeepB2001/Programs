import java.util.*;
class decode
{
    public static void main(String args[])
    {
        int i,l,a=0,st;
        String s,s2="";
        char ch,ch1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coded text");
        s=sc.nextLine();
        s=s.toUpperCase();
        System.out.println("Enter Shift");
        st=sc.nextInt();
        if((st<1)||(st>26))
        System.out.println("Invalid Shift Value");
        else
        {
            l=s.length();
            if(l<100)
            {
              for(i=0;i<l-1;i++)
              {
                  ch=s.charAt(i);
                  ch1=s.charAt(i+1);
                  