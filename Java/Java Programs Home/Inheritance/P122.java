//ambiguity in single inheritance

class cl1
{
	int i=1;
	void output1()
	{
		System.out.println("i = "+i);
	}
}

class cl2 extends cl1
{
	int i=2;
	void output2()
	{
		System.out.println("value of cl2 i = "+i);
		System.out.println("value of cl2 i = "+this.i);		//i of this same class
		System.out.println("value of cl1 i = "+super.i);	//i of parent class
	}
}

class P122
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.output1();
		cl2 ob2 = new cl2();
		ob2.output2();
	}
}
