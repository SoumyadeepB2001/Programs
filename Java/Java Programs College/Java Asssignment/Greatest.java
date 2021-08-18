import java.util.*;
class Greatest 
{
	public static void main(String args[])
	 {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		n1 = sc.nextInt();
		System.out.println("Enter the second number");
		n2 = sc.nextInt();
		System.out.println("Enter the third number");
		n3 = sc.nextInt();

		System.out.print("The greatest of the three numbers is: ");
		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1);
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2);
		else
			System.out.println(n3);
	}
}