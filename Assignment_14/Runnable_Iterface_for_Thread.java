package MultThreading;

public class Runnable_Iterface_for_Thread implements Runnable{
	Thread th;
	public Runnable_Iterface_for_Thread() {
		th = new Thread(this);
		th.start();
	}
	public void run() {
		System.out.println(th.currentThread());
	}
}
