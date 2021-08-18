class P95
{
	int a,b;
	
	P95()
	{
		a=0;
		b=0;
	}
	
	P95(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	P95(P95 ob)
	{
		a=ob.a;
		b=ob.b;
	}
	
	void display()
	{
		System.out.println("a = "+a+" b = "+b);
	}
}

class cl
{
	public static void main(String args[])
	{
		P95 ob1 = new P95(5,6);		//parameterised constructor
		ob1.display();
		P95 ob2 = new P95(ob1);		//copy constructor -> ob1 is passed in ob2 constructor, both are in same class
		ob2.display();
	}
}

