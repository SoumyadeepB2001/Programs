//ambiguity in single inheritance

class cl1
{
	int i;
	void input1(int i)
	{
		this.i=i;
	}
	void output1()
	{
		System.out.println("i = "+i);
	}
}

class cl2 extends cl1
{
	int i;
	void input2(int i, int j)
	{
		this.i=i;
		input1(j);
	}
	void output2()
	{
		System.out.println("sum of 2 i is "+(this.i+super.i));
	}
}

class P124
{
	public static void main(String args[])
	{
		cl2 ob2 = new cl2();
		ob2.input2(10,20);
		ob2.output2();
	}
}
