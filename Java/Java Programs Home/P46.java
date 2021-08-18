class P46
{
	public static void main(String args[])
	{
		String s1="sunday";
		String s2="";				//blank string
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);		//s2=y+a+d+n+u+s
			System.out.println(s1.charAt(i));
		}
		System.out.println("Reversed string = "+s2);
	}
}
		
