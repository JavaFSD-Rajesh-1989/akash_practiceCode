
class ThreadRunnable implements Runnable{
	public void run() {
		System.out.println("Running Thread");
	}
}
public class MultiThreadCode {
	public static void main(String[] args) {
		ThreadGroup m1 = new ThreadGroup("Thread 1");
		ThreadGroup j1 = new ThreadGroup("Thread 2");
		ThreadGroup e1 = new ThreadGroup("Thread 3");
		
		Thread t1 = new Thread(m1, new ThreadRunnable());
		Thread t2 = new Thread(j1, new ThreadRunnable());
		Thread t3 = new Thread(j1, new ThreadRunnable());
		Thread t4 = new Thread(e1, new ThreadRunnable());
		Thread t5 = new Thread(e1, new ThreadRunnable());
		Thread t6 = new Thread(e1, new ThreadRunnable());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();


		display(m1);
		display(j1);
		display(e1);
	}
	public static void display(ThreadGroup th) {
		System.out.println(th.getName());
		System.out.println(th.getParent());
		System.out.println(th.activeCount());
		System.out.println(th.activeGroupCount());
		System.out.println(th.getMaxPriority());
		th.setMaxPriority(2);
		System.out.println(th.getMaxPriority());
	}
}
