//concat function

class P29
{
	public static void main(String args[])
	{
		String s1="Sun";		//String is immutable - cannot change the value
		String s2=s1.concat("day");
		System.out.println("String s1 = "+s1);
		System.out.println("String s2 = "+s2);
		s1=s1.concat("day");	//new reference is created and overwrited with the old value
		System.out.println("String s1 = "+s1);
		System.out.println("String s2 = "+s2);
	}
}

