import java.util.*;
class sentence6
{
     public static void main(String args[])
     {
        int i,l,p=0;
        String s,s1="";
        char ch;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
         {
            ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                p=i;
                break;
            }
        }
            s1=s.substring(p,l)+s.substring(0,p)+"AY";
            System.out.println("Piglatin Form = "+s1);
        }
    }
