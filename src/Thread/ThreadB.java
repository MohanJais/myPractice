package Thread;

public class ThreadB extends Thread{
	
	int total =0;
	public void run() {
		synchronized (this) {
			System.out.println("Child cal");
			for(int i =1; i<=100;i++){
				total = total + i;
		}
			}
		
		System.out.println("child giving notification");
		this.notify();

	}

}
