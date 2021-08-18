import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int i,l,l1,p=0,j,k=0;
        String s,s1="",s2="";
        char ch,ch1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            s2="";
            if(ch==' ')
            {
                s1=s.substring(p,i);
                p=i+1;
                l1=s1.length();
                for(j=0;j<l1;j++)
                {
                    ch1=s1.charAt(j);
                    s2=ch1+s2;
                }
                if(s1.equalsIgnoreCase(s2))
                {
                    System.out.println(s1);
                    k=1;
                }
            }
        }
        if(k==0)
        {
            System.out.println("No palindrome word is present");
        }
    }
}


    