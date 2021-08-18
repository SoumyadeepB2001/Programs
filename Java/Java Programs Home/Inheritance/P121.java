//hierchical

class cl1
{
	int a1;
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
	int a2;
	void input2(int n)
	{
		a2=n;
	}
	void output2()
	{
		System.out.println("value of a2 = "+a2);
	}
}

class cl3 extends cl1
{
	int a3;
	void input3(int n)
	{
		a3=n;
	}
	void output3()
	{
		System.out.println("value of a3 = "+a3);
	}
}

class P121
{
	public static void main(String args[])
	{
		System.out.println("For Super class");
		cl1 ob1 = new cl1();
		ob1.input1(1);
		ob1.output1();
		System.out.println("value of a1 = "+ob1.a1);
		
		System.out.println("For Sub class 1");
		cl2 ob2 = new cl2();
		ob2.input2(2);
		ob2.output2();
		System.out.println("value of a2 = "+ob2.a2);
		ob2.input1(3);
		ob2.output1();
		System.out.println("value of a1 = "+ob2.a1);
		
		System.out.println("For Sub class 2");
		cl3 ob3 = new cl3();
		ob3.input3(4);
		ob3.output3();
		System.out.println("value of a3 = "+ob3.a3);
		ob3.input1(6);
		ob3.output1();
		System.out.println("value of a1 = "+ob3.a1);
	}
}
