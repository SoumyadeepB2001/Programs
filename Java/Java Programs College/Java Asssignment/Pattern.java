import java.util.Scanner;
class Pattern 
{
    public static void main(String args[])
    {
        int n, i, j, k, l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        System.out.println();
        for (i = 1; i <= n; i++) 
        {
            for (j = n; j>i; j--) 
            {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) 
            {
                System.out.print(k);
            }
            for (l = i-1; l >= 1; l--) 
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}