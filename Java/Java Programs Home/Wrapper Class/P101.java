class P101
{
	public static void main(String args[])
	{
		System.out.println("Auto boxing");
		char i='x';			//char variable
		Character iob = i;	//wrapper class - autoboxing for a character
		System.out.println("Character value i = "+i);
		System.out.println("Character class value = "+iob);
		
		System.out.println("Unboxing");
		char j = iob; //unboxing
		System.out.println("Character value j = "+j);
		System.out.println("Character class value = "+iob);
	}
}
