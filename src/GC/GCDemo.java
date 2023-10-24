package GC;

public class GCDemo {

	GCDemo gcDemo3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GCDemo gcDemo = new GCDemo();
		GCDemo gcDemo2 = new GCDemo();

		gcDemo.gcDemo3 = gcDemo2;
		gcDemo2.gcDemo3 = gcDemo;
		
		gcDemo = null;
		gcDemo2 = null;
		
		gcDemo = gcDemo2;
		
		//gcDemo = gcDemo2;
		
		System.gc();
		// 180010888
		//Runtime.getRuntime().gc();
		System.out.println("Main");

	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finslize");
		super.finalize();
		System.out.println("Finslized");

	}
}
