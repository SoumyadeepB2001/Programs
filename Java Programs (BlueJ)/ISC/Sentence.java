//Code written in base class
import java.util.*;
class Sentence
{
    protected String str;
    Sentence() //Constructor to initialise the value of str
    {
        str="";
    }
    void Accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        str=sc.nextLine();
    }
}
//End of base class