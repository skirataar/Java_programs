package thread;

public class mythread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child thread"+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
