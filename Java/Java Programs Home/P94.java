/*
1. h, m, s
2. default constructor
3. Parameterised constructor
4. void display()
5. add()
*/

class P94
{
	int h,m,s;
	P94()
	{
		h=0;
		m=0;
		s=0;
	}
	
	P94(int h, int m, int s)
	{
		this.h=h;
		this.m=m;
		this.s=s;
	}
	
	void display()
	{
		System.out.println(h+" : "+m+" : "+s);
	}
	
	P94 add (P94 ob2)
	{
		P94 ans = new P94();
		
		ans.s = this.s + ob2.s;
		ans.m += ans.s/60;
		ans.s=ans.s%60;
		
		ans.m +=this.m + ob2.m;
		ans.h += ans.m/60;
		ans.m=ans.m%60;
		
		ans.h +=this.h + ob2.h;
		
		return ans;
	}
}

class cl
{
	public static void main(String args[])
	{
		P94 ob1 = new P94(1,30,30);
		P94 ob2 = new P94(1,40,40);
		P94 ob3 = new P94();
		
		ob3 = ob1.add(ob2);
		ob3.display();
	}
}
		
