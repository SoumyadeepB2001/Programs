import java.util.*;
class abbrvpal
{
    public static void main(String args[])
    {
        int i,l,l1,j;
        String s,s1="",s2="";
        char ch,ch1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=" "+s;
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+s.charAt(i+1);
            }
            }
            System.out.println("Abbreviation = "+s1);
            l1=s1.length();
            for(j=0;j<l1;j++)
            {
                ch1=s1.charAt(j);
                s2=ch1+s2;
            }
            if(s1.equalsIgnoreCase(s2))
            {
             System.out.println(s2+" is a Palindrome string");
            }
            else
            {
                 System.out.println(s2+" is not a Palindrome string");
                }
            }
        }
    
    
    
    
    
    
    
    
    
    