class P100
{
	public static void main(String args[])
	{
		System.out.println("Autoboxing");
		int i=5;			//int variable
		Integer iob = i;	//wrapper class - autoboxing for an integer
		System.out.println("Integer value i = "+i);
		System.out.println("Integer class value = "+iob);
		
		System.out.println("Unboxing");
		int j = iob; //unboxing
		System.out.println("Integer value j = "+j);
		System.out.println("Integer class value = "+iob);
	}
}
