package builderDesign;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		Director director = new Director(earthQuakeResistantBuilder);
		
		director.manageRequiredHomeConstructor();
		Home homeConstructedAtTheEnd = director.getComplexHomeOfObject();
		
		System.out.println(homeConstructedAtTheEnd);
		System.out.println(homeConstructedAtTheEnd.floor);
		System.out.println(homeConstructedAtTheEnd.walls);
		
		
		FloodResistantBuilder floodResistantBuilder = new FloodResistantBuilder();
		Director director2 = new Director(floodResistantBuilder);

		director2.manageRequiredHomeConstructor();
		Home homeConstructedAtEnd = director2.getComplexHomeOfObject();
		
		System.out.println(homeConstructedAtEnd);
		System.out.println(homeConstructedAtEnd.floor);
		System.out.println(homeConstructedAtEnd.walls);

	}

}
