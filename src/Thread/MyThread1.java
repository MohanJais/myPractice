package Thread;

public class MyThread1 extends Thread{
	
	Display d;
	MyThread1(Display d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		super.run();
		d.displayN();
	}

}
