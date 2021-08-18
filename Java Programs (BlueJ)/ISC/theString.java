import java.util.*;
class theString
{
    String Str;
    int cap,sm;
    theString()
    {
        Str="";
        cap=0;
        sm=0;
    }
    void Accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        Str=sc.nextLine();
    }
    void Recursive_fn(int a)
    {
        if(a>0)
        {
            if(Str.charAt(a-1)>='A' && Str.charAt(a-1)<='Z')
            cap++;
            if(Str.charAt(a-1)>='a' && Str.charAt(a-1)<='z')
            sm++;
            a--;
            Recursive_fn(a);
        }
        
    }
    void display()
    {
        Recursive_fn(Str.length());
        System.out.println("The Original String "+Str);
        System.out.println("No. of Caps letter " +cap);
        System.out.println("No. of Small letters " +sm);
    }
    public static void main(String args[])
    {
        theString ob=new theString();
        ob.Accept();
        ob.display();
    }
}



        
