import java.util.Scanner;

class P73 {
	public static void main(String args[]) {
		int a[][][][] = {
				{ { { 10, 20, 30, 40 }, { 30, 40, 50, 60 } }, { { 11, 22, 33, 44 }, { 33, 44, 55, 66 } },
						{ { 100, 200, 300, 400 }, { 300, 400, 500, 600 } } },
				{ { { 10, 20, 30, 40 }, { 30, 40, 50, 60 } }, { { 11, 22, 33, 44 }, { 33, 44, 55, 66 } },
						{ { 100, 200, 300, 400 }, { 300, 400, 500, 600 } } } };

		System.out.println("Total number of 3D array = " + a.length);
		System.out.println("Total number of 2D array in 0th 3D array = " + a[0].length);
		System.out.println(
				"Total number of 1D array in 0th 1D array of 0th 2D array of 0th 3D array = " + a[0][0].length);
		System.out.println("Total number of elements in 0th 1D array in 0th 2D array of 0th 3D array of 0th 4D array = "
				+ a[0][0][0].length);
	}
}
