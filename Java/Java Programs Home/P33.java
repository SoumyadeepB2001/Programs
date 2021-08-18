class P33
{
	public static void main(String args[])
	{
		String s1=new String("sunday"); 
		String s2=new String("sunday"); 	//s1 and s2 shares the same reference
		if(s1==s2)
		{
			System.out.println("s1 and s2 are same");
		}
		else
		{
			System.out.println("s1 and s2 are not same");
		}
		String s3=new String("sunday"); 
		if(s3==s2)
		{
			System.out.println("s3 and s2 are same");
		}
		else
		{
			System.out.println("s3 and s2 are not same");
		}
	}
}

