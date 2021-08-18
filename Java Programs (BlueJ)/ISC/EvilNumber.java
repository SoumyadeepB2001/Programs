import java.util.*;
class EvilNumber
{
    String toBinary(int n) // Function to convert a number to Binary
    {
        int r;
        String s=""; //Variable for storing the result
        while(n>0)
            {
                r=n%2; //Finding remainder by dividing the number by 2
                s=r+s; //Adding the remainder to the result and reversing at the same time
                n=n/2;
            }
        return s;
    }
    int countOne(String s) //Function to count the number of ones 
    {
        int c=0, l=s.length();
        char ch;
for(int i=0; i<l; i++)
        {
ch=s.charAt(i);
            if(ch=='1')
            {
c++;
            }
        }
        return c;
    }

    public static void main(String args[])
    {
EvilNumber ob = new EvilNumber();
        Scanner sc = new Scanner(System.in);

System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
if(n>0)
{
        String bin = ob.toBinary(n);
System.out.println("Binary Equivalent = "+bin);

        int x = ob.countOne(bin);
System.out.println("Number of Ones = "+x);

        if(x%2==0)
System.out.println(n+" is an Evil Number");
        else
System.out.println(n+" is not an Evil Number");
    }
else
System.out.println(n+" is not a positive integer");
}
}
