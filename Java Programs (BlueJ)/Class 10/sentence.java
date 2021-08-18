import java.util.*;
class sentence
 {
    public static void main(String args[])
        {
        int m=0,j,k,i,l,l1,p=0;
        char ch,ch1,ch2;
        String s,s1="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s.substring(p,i);
                p=i+1;
            l1=s1.length();
            for(j=0;j<l1;j++)
            {
                ch1=s1.charAt(j);
                for(k=j+1;k<l1;k++)
                {
                    ch2=s1.charAt(k);
                    if(ch1==ch2)
                    {
                        m=1;
                    }
                }
            }
             if(m==0)
            {
                System.out.println(s1);
            }
        }           
            m=0;
            
        }
        }
    }

              
          