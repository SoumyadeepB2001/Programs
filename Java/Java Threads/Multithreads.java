class cl1 extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("cl1 thread - " + Thread.currentThread().getName()+" is running by extending Thread Class");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

class cl2 extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("cl2 thread - " + Thread.currentThread().getName()+" is running by extending Thread Class");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
 class Main {
    public static void main(String[] args)
    {
		System.out.println("Start of Main Class");
        int n=5; // Number of threads
        for (int i=0;i<n;i++) 
		{
			cl1 ob1=new cl1();
            ob1.start();
		}
        for (int i=0;i<n;i++) 
		{
			cl2 ob2=new cl2();
            ob2.start();
		}
        System.out.println("End of Main Class");
    }
}