import java.util.*;
class Palindrome 
{
	static int reverse(int n, int s) 
	{
		if (n == 0)
			return s;

		s = (s * 10) + (n % 10);
		return reverse(n / 10, s);
	}

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();

		int rev = reverse(n, 0);
		if (rev == n)
			System.out.println(n + " is a palindrome number");
		else
			System.out.println(n + " is not a palindrome number");
	}
}