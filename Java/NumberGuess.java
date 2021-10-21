import java.lang.*;
import java.util.*;

public class NumberGuess {
	public static void main(String args[]) {
		int max = 100;
		int min = 30;
		int range = max - min + 1;
		int rand = (int) (Math.random() * range) + min;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Guess the number");
			int a = sc.nextInt();
			if (a > rand)
				System.out.println("The original number is lesser than " + a);
			else if (a < rand)
				System.out.println("The original number is greater than " + a);
			else {
				System.out.println("Correct guess! The original number is: " + rand);
				break;
			}
		}

	}
}
