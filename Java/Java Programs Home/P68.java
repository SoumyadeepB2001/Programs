import java.util.Scanner;

class P68 {
	public static void main(String args[]) {
		int a[] = { 5, 6, 7 }; // taking the values directly
		for (int i = 0; i < 3; i++)
			System.out.print(a[i]);
		System.out.println();

		int b[] = new int[3]; // entering the values
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
			b[i] = s.nextInt();
		for (int i = 0; i < 3; i++)
			System.out.print(b[i]);
		System.out.println();

		int c[]; // entering the values
		c = new int[3];
		for (int i = 0; i < 3; i++)
			c[i] = s.nextInt();
		for (int i = 0; i < 3; i++)
			System.out.print(c[i]);
		System.out.println();

	}
}
