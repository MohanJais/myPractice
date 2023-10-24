package Prac1;

public class Singleton {
	
		//Private Constructor: 
		//Private Static Instance: 
		//Static Method to Get Instance:
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	private static Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		}
		return instance;
		
	}

}
