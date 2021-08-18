import java.util.Scanner;
class Add 
{
    public static void main(String args[]) {
        int n, i, num, sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Enter a number");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum of all the numbers = "+sum);
    }
}