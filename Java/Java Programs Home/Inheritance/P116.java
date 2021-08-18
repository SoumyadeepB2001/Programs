//single inheritance

class cl1
{
	protected int a1;
	void input1(int n)
	{
		a1=n;
	}
	void output1()
	{
		System.out.println("value of a1 = "+a1);
	}
}

class cl2 extends cl1
{
	protected int a2;
	void input2(int n)
	{
		a2=n;
	}
	void output2()
	{
		System.out.println("value of a2 = "+a2);
	}
}

class P116
{
	public static void main(String args[])
	{
		System.out.println("For Super class");
		cl1 ob1 = new cl1();
		ob1.input1(3);
		ob1.output1();
		System.out.println("value of a1 = "+ob1.a1);
		
		System.out.println("For Sub class");
		cl2 ob2 = new cl2();
		ob2.input2(5);
		ob2.output2();
		System.out.println("value of a2 = "+ob2.a2);
		ob2.input1(7);
		ob2.output1();
		System.out.println("value of a1 = "+ob2.a1);
	}
}
