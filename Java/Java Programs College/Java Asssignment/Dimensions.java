import java.util.*;
class Dimensions
{
	int length,breadth,height;
	Dimensions()
	{
		length=0;
		breadth=0;
		height=0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		length=sc.nextInt();
		System.out.println("Enter breadth");
		breadth=sc.nextInt();
		System.out.println("Enter height");
		height=sc.nextInt();
		calculate();
	}
	void calculate()
	{
		int volume=length*breadth*height;
		display(volume);
	}
	void display(int v)
	{
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
		System.out.println("Height: "+height);
		System.out.println("Volume: "+v);
	}
	public static void main(String[] args) {
		Dimensions ob=new Dimensions();
		ob.input();
	}

}