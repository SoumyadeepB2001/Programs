// Code written in base class
import java.util.*;
class CtoF
{ 
    public static void main(String args[]) //Main function
{
    Temperature ob= new Temperature();
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in Celsius"); //Accepting the temperature in Celsius from the user
double temp=ob.convert(sc.nextDouble());
System.out.println("The temperature in Fahrenheit is = "+temp);
}
}
//End of base class