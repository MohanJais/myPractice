package Thread;

public class syncronizedDemo {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		
		DisPrint dP1 = new DisPrint();
	    DisPrint dP2 = new DisPrint();

		MyThread t3 = new MyThread(dP1, "Dhoni");
		MyThread t4 = new MyThread(dP2, "YuvRaj");

		t3.start();
		t4.start();
	}

}

