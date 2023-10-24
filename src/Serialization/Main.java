package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Emp e = new Emp(2,"Jaiswal");
		e.setId(1);
		e.setName("Mohan");
		
		//Serialization
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\Serialization.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(e);
		objectOutputStream.close();
		
		
		//DeSerialization 
		FileInputStream fileInputStream = new FileInputStream("D:\\Serialization.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Emp reEmp = (Emp) objectInputStream.readObject();
		System.out.println(reEmp.getId());
		System.out.println(reEmp.getName());
		//System.out.println(reEmp.getClass());
		objectInputStream.close();
		fileInputStream.close();

	}

}
