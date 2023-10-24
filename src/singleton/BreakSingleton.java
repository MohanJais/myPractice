package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		Singleton oriSingleton = Singleton.getInstance();
		Singleton dupSingleton = Singleton.getInstance();
		
		System.out.println("oriSingleton: "+oriSingleton.hashCode());
		System.out.println("dupSingleton: "+dupSingleton.hashCode());
		
		// Reflection 
		Class<?> singletonCls = Class.forName("singleton.Singleton");
		Constructor<Singleton> constructor = (Constructor<Singleton>) singletonCls.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton brokeSingletonReflection = constructor.newInstance();
		System.out.println("oriSingleton: "+oriSingleton.hashCode());
		System.out.println("brokeSingletonReflection: "+brokeSingletonReflection.hashCode());
		
		//Serialization
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("D:\\Serialization.ser"));
		objectOutputStream.writeObject(oriSingleton);
		objectOutputStream.close();
		
		//DeSerialization
		ObjectInputStream inputStream= new ObjectInputStream(new FileInputStream("D:\\Serialization.ser"));
		Singleton brokeSingletonSerialization = (Singleton) inputStream.readObject();
		
		System.out.println("oriSingleton: "+oriSingleton.hashCode());
		System.out.println("brokeSingletonSerialization: "+brokeSingletonSerialization
				.hashCode());
		
		
		//Cloning
		Singleton brokeSingletonCloning = (Singleton) oriSingleton.clone();
		
		System.out.println("oriSingleton: "+oriSingleton.hashCode());
		System.out.println("brokeSingletonCloning: "+brokeSingletonCloning
				.hashCode());
	}

}
