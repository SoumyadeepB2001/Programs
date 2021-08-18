class P51
{
	public static void main(String args[])
	{
		String s1="Sunday";
		int l=s1.length();
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.println();
		}
	}
}
