import java.util.*;
class middle_name_remover
{
    public static void main(String args[])
    {
        int c=0,i,j,l,m=0,n=0;
        char ch;
        String s;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a name");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
            {
            ch=s.charAt(i);
            if(ch==' ')
            {
                c++; 
                if(c==1)
            {
                m=i;
            }
            if(c==2)
            {
                n=i;
            }
            }
            
        }
        System.out.println(s.substring(0,m)+s.substring(n,l));
    }
}
            
                
            