package Thread;

public class ThreadClass extends Thread{

	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child Thread "+i);
			System.out.println("Thread name "+Thread.currentThread().getName());
 
			//System.out.println("demon Thread"+ Thread.currentThread().isDaemon());

		}
		
	}
}
