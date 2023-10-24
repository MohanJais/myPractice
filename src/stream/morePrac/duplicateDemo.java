package stream.morePrac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateDemo {
	
public static void main(String[] args) {
    List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
    String str = "you are awasone";
    	Map<String, Long> nameCounts = names.stream().filter(x->Collections.frequency(names, x)>1)
    		          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    	System.out.println(nameCounts);
    	
    	Map<String, Long> charCount = str.chars().mapToObj(c->(char)c)
    							.filter(x->Collections.frequency(str.chars(), x)>1)
    							.collect(Collectors.groupingBy(Funtion.identity(), Collectors.counting())));
    	System.out.println(charCount);		
	}
}
