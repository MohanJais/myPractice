package Thread;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RunnableDemo runnableDemo = new RunnableDemo();
		 runnableDemo.run();
		// ThreadClass threadClass = new ThreadClass();
		// threadClass.start();
		// threadClass.setDaemon(true);

		 Thread thread = new Thread(runnableDemo);
		// thread.setDaemon(true);
		 thread.start();
		
		for(int i=0;i<10;i++)
			System.out.println("Main Thread "+i);

	}

}
