package singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	
	private static final long serialVersionUID = 1L;
	
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
