package Practice;



public class ThreadConcept {

	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {

		Thread th=new Thread("First Thread");
		th.start();
		System.out.println(th.getName());
		
		
		Runnable t = (Runnable) new ThreadConcept();
		Thread t1 = new Thread(t);
		t1.start();
}}
