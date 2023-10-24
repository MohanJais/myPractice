package structural.flyweight;

public class AnimalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal catAnimal = AnimalFactory.getCat("CAT");
		catAnimal.printAnimalAttribute();
		
		Animal cowAnimal = AnimalFactory.getCat("COW");
		cowAnimal.printAnimalAttribute();
		
		Animal dogAnimal = AnimalFactory.getCat("DOG");
		dogAnimal.printAnimalAttribute();
		
		Animal cowAnimal2 = AnimalFactory.getCat("COW");
		cowAnimal2.printAnimalAttribute();
		
		System.out.println(catAnimal);
		System.out.println(dogAnimal);
		System.out.println(cowAnimal);
		System.out.println(cowAnimal2);
	}

}
