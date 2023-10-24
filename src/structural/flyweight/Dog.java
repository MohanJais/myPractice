package structural.flyweight;

public class Dog implements Animal{

	private String name = null;
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void printAnimalAttribute() {
		// TODO Auto-generated method stub
		System.out.println("Name of animal is "+ this.name);
		System.out.println("No of Eyes: "+ CommonClass.eyes);
		System.out.println("No of Legs: "+ CommonClass.legs);
		System.out.println("No of Nose: "+ CommonClass.nose);
		System.out.println("No of Tail: "+ CommonClass.tail);

	}

}
