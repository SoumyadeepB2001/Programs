
/**
 * Program to print the age of your father, mother and grandfather if your age is 11 years, your father's age is thrice your age and your mother is three years younger than your father. your ggrandfather is twice your father's age.
 * Soumyadeep Banerjee
 */
import java.lang.*;
class age
{
    public static void main (String args [])
    {
        int s=11, f=0, m=0, g=0;
        f=3*s;
        m=f-3;
        g=2*f;
        System.out.println ("My age is"+" "+s+" "+ "Years");
        System.out.println ("My father's age is"+" "+f+" "+"Years");
        System.out.println ("My mother's age is"+" "+m+" "+"Years");

        System.out.println ("My grandfather's age is"+" "+g+" "+"Years");
    }
}