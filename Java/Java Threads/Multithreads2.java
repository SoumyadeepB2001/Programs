class cl implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(Thread.currentThread().getName()+ " is running");
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
        int n = 4; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread t=new Thread(new cl());
            t.start();
        }
    }
}