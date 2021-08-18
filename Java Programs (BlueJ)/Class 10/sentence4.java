import java.util.*;
class sentence4
{
     public static void main(String args[])
     {
        int i,l,c=0;
        String s;
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
                continue;
            }
            else
            {
                c++;
        }
    }
                System.out.println(c+" consonants");
            
        }
    }

