import java.util.Scanner;

interface shape
{
	void input();
	void area();
}

class square implements shape
{
	int a;
	public void input()
	{
		System.out.println("Enter the length of the square");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	}
	public void area()
	{
		System.out.println("Area of the Square is "+(a*a));
	}
}

class P158
{
	public static void main(String args[])
	{
		square ob = new square();
		ob.input();
		ob.area();
	}
}
