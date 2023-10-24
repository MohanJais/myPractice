package singleton;

public class SingletonClass {
	
	private static SingletonClass singletonInstance = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	public void simpleMethod() {
		System.out.println("Hashxode of simple obj"+ singletonInstance);
	}

}
