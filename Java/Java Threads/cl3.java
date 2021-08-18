class cl3 implements Runnable {
	public void run() {
		System.out.println("run() is running");
	}

	public static void main(String args[]) {
		cl3 ob = new cl3();
		// ob.start(); //error
		ob.run();
	}
}
