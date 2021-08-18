interface cl1
{
	void f1();
}

interface cl2
{
	void f2();
}

class cl3 implements cl1,cl2 //class cl3 implementing multiple interfaces at once
{
	int a;
	public void f1()
	{
		 a=5;
	}
	public void f2()
	{
		System.out.println("a = "+a);
	}
}

class P161
{
	public static void main(String args[])
	{
		cl3 ob = new cl3();
		ob.f1();
		ob.f2();
	}
}
