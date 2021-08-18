import java.util.*;
class sentence5
{
     public static void main(String args[])
     {
        int i,l,l1,j,c=0,p=0;
        String s,s1;
        char ch,ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s+" ";
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
         {
            ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s.substring(p,i);
                l1=s1.length();
                p=i+1;
                for(j=0;j<l1;j++)
                {
                    ch1=s1.charAt(j);
                    if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
                    {
                        c++;
                    }
                }
                   System.out.println("No of vowels in "+s1+" ="+c);
                        c=0;
                    }
                  }
                  }
    }
