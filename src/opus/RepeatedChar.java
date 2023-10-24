package opus;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("mohankumar");
		//Repeated char
		//Java8

		Map<Character, Long> mapCount = str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapCount);

	}

}
