import java.util.*;
class sent
{
    public static void main(String args[])
    {
        int i,l,p=0,c=0;
        String s,s1="";
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            s1="";
            if(ch==' ')
            {
                s1=s.substring(p,i);
                c++;
                p=i+1;
                if(c%2==0)
                {
                  System.out.println(s1+" ");  
                }
            }
        }
        }
    }
                    
                
                