package Thread;

public class MyThread2 extends Thread{
	
	Display d;
	MyThread2(Display d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		super.run();
		d.displayC();
	}

}
