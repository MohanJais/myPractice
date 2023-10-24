package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class ListToMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> personList = Arrays.asList(
	            new Person(1, "Alice"),
	            new Person(2, "Bob"),
	            new Person(3, "Charlie")
	        );
		
		Map<Integer, String> personMap = personList.stream()
					.collect(Collectors.toMap(Person::getId, Person::getName));
		
		personMap.forEach((id,name)->System.out.println(id+" : "+name));
	}

}
