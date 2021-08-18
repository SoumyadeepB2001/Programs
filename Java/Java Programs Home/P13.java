class cl
{
	int a,b;
	void input()
	{
		a=5;
		b=6;
	}
	void output()
	{
		System.out.println("a = "+a+" b = "+b);
	}
}

class P13
{
	public static void main(String args[])
	{
		cl ob = new cl();
		ob.input();
		ob.output();
	}
}
