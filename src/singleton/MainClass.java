package singleton;

import factory.pattern.Teacher;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass singletonObj = SingletonClass.getInstance();
		singletonObj.simpleMethod();
		
		SingletonClass singletonObj1 = SingletonClass.getInstance();
		singletonObj1.simpleMethod();
		
		SingletonClass singletonObj2 = SingletonClass.getInstance();
		singletonObj2.simpleMethod();
		
		Singleton singleton = Singleton.getInstance();
		
		
		
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		
		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);


	}

}
