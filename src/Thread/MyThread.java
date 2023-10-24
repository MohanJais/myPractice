package Thread;

public class MyThread extends Thread{
	
	DisPrint dP;
	String name;
	MyThread(DisPrint dP, String name) {
		this.dP = dP;
		this.name = name;
	}
	
	public void run() {
		//super.run();
		dP.wish(name);
	}

}
