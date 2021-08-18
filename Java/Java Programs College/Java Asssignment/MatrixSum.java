import java.util.*;

class MatrixSum {
	public static void main(String args[]) {
		int n, m, j, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of the matrix: Rows and Columns");
		n = sc.nextInt();
		m = sc.nextInt();
		int ar[][] = new int[n][m];
		int ar2[][]=new int[n][m];
		int sum[][]=new int[n][m];
		
		System.out.println("Enter " + (n * m) + " elements of the first matrix");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter " + (n * m) + " elements of the second matrix");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				ar2[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				sum[i][j] = ar[i][j]+ar2[i][j];
			}
		}

		System.out.println("The first matrix:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("The second matrix:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(ar2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("The sum of the two matrices:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}
}