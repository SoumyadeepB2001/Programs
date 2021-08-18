import java.util.*;
class cl1
{
	void output()
	{
		System.out.println("output() of class cl1");
	}
}
class cl2 extends cl1
{
	void output()
	{
		System.out.println("output() of class cl2");
	}
}
class Overriding
{
	public static void main(String[] args) {
		cl1 ob1=new cl1();
		cl2 ob2 =new cl2();
		ob1.output();
		ob2.output(); //output() function of class cl2 will be called and not of class cl1. This is called method overriding.
	}
}