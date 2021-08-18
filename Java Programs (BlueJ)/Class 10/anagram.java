import java.util.*;
class anagram
{
    public static void main(String args[])
    {
        int p1,p2,i,j,as1,as2,s1=0,s2=0;
        String str1,str2,str3="",str4="";
        char chr1,chr2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first word");
        str1=sc.next();
        str1=str1.toUpperCase();
        System.out.println("Enter second word");
        str2=sc.next();
        str2=str2.toUpperCase();
        p1=str1.length();
        p2=str2.length();
        if(p1==p2)
        {
            for(i=65;i<=90;i++)
            {
                for(j=0;j<p2;j++)
                {
                    chr1=str1.charAt(j);
                    chr2=str2.charAt(j);
                    as1=(int)chr1;
                    as2=(int)chr2;
                    if(as1==i)
                    {
                        str3=str3+chr1;
                        s1=s1+as1;
                    }
                    if(as2==i)
                    {
                        str4=str4+chr2;
                        s2=s2+as2;
                    }
                }
            }
            if(str3.equals(str4)&&(s1==s2))
            {
               System.out.println(str1+" and "+str2+" are Anagram words"); 
            }
            else
            {
                System.out.println(str1+" and "+str2+" are not Anagram words"); 
            }
            }
            else
            {
                System.out.println("The words are not Anagram words"); 
                        
            }
        }
    }            