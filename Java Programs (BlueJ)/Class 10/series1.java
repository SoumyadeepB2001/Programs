import java.lang.*;
class series1
{
    public static void main (String args [])
    {
        int i,j=1,s=0,s2=0;
        for(i=1;i<=10;i++)
        {
        System.out.println(j*3);   
        s=s+(j*3);
        j=j*2;
    }
    System.out.println(s);
 }
}