//single inheritance

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
	void input2(int n1, int n2)
	{
		a1=n1;
		a2=n2;
	}
	void output2()
	{
		System.out.println("value of a1 = "+a1);
		System.out.println("value of a2 = "+a2);
		System.out.println("sum of a1 and a2 = "+(a1+a2));
	}
}

class P117
{
	public static void main(String args[])
	{
		cl2 ob = new cl2();
		ob.input2(3,5);
		ob.output2();
	}
}
