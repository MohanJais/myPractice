package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Krishna");
		names.add("Sayam");
		
		for(String name:names) {
			System.out.println(name);
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		System.out.println(nameStream);
		
		//nameStream.forEach(System.out::println);
		System.out.println(nameStream);
	}

}
