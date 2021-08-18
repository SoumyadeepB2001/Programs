interface cl1
{
	void f1();
}

interface cl2 implements cl1 //error: an interface cannot implement another interface. So it has to extend it.
{
	void f2();
}

/*
P159.java:6: error: '{' expected
interface cl2 implements cl1
             ^
1 error
*/

class cl3 implements cl2
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

class P159
{
	public static void main(String args[])
	{
		cl3 ob = new cl3();
		ob.f1();
		ob.f2();
	}
}
