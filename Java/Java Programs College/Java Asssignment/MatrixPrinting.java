import java.util.*;

class MatrixPrinting {
	public static void main(String args[]) {
		int n, m, j, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of the matrix: Rows and Columns");
		n = sc.nextInt();
		m = sc.nextInt();
		int ar[][] = new int[n][m];
		System.out.println("Enter " + (n * m) + " elements of the matrix");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix entered is:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}