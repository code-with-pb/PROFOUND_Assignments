package MultThreading;

public class ThreadMethod extends Thread{
	ThreadMethod(){
		this.start();
	}
	public void run() {
		try {
			System.out.println(this.getName());
			System.out.println(this.getPriority());
			System.out.println(this.isAlive());
			this.join();
			this.sleep(10000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
