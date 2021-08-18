class P32
{
	public static void main(String args[])
	{
		String s1="sunday"; 
		String s2="sunday";		//s1 and s2 shares the same reference
		if(s1==s2)
		{
			System.out.println("s1 and s2 are same");
		}
		else
		{
			System.out.println("s1 and s2 are not same");
		}
		String s3="sunday";
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

