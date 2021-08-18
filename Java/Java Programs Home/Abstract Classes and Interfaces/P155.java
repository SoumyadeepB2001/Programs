interface cl1
{
	int a=5;		//public, static and final by default
	void output();	//public and abstract by default
}

class cl2 implements cl1
{
	public void output()
	{
		System.out.println("1st interface program "+(a++));//error
	}
}

/*
P154.java:11: error: cannot assign a value to final variable a
		System.out.println("1st interface program "+(a++));
		                                             ^
1 error
*/

class P155
{
	public static void main(String args[])
	{
		cl2 ob = new cl2();
		ob.output();
	}
}

