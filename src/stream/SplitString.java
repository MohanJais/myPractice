package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "I love you Vasu";
		
		//Arrays.stream(input.split("")).collect(Collectors.groupingBy(null))
		
		Map<String, Long> countMap=
				Arrays.stream(input.split(""))
				//.filter(Character::isLetter)
			.collect(Collectors.groupingBy(
					Function.identity(),Collectors.counting()
					));
		forEach("Char: "+ Character+"Count");
		
	}

}
